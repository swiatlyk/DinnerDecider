package com.swiatlyk.dinnerdecider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.swiatlyk.dinnerdecider.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val foodList = arrayListOf("Chines", "Pizza", "Kebab","Ramen", "KFC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        binding.selectedFoodTxt.text = "Burger King"
        binding.decideButton.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            binding.selectedFoodTxt.text = foodList[randomFood]
        }

        binding.addFoodBtn.setOnClickListener {
            val newFood = binding.addFoodTxt.text.toString()
            foodList.add(newFood)
            binding.addFoodTxt.text.clear()
        }
    }
}