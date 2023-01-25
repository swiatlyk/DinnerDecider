package com.swiatlyk.dinnerdecider

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
//import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
    private val foodList = arrayListOf("Chines", "Pizza", "Kebab","Ramen", "KFC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var selectedFoodTxt = findViewById<TextView>(R.id.selectedFoodTxt)
        var decideButton = findViewById<Button>(R.id.decideButton)
        var addFoodTxt = findViewById<EditText>(R.id.addFoodTxt)
        var addFoodBtn = findViewById<Button>(R.id.addFoodBtn)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)

        decideButton.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

//        binding.selectedFoodTxt.text = "Burger King"
//        binding.decideButton.setOnClickListener {
//            val random = Random()
//            val randomFood = random.nextInt(foodList.count())
//            binding.selectedFoodTxt.text = foodList[randomFood]
//        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
        }

//        binding.addFoodBtn.setOnClickListener {
//            val newFood = binding.addFoodTxt.text.toString()
//            foodList.add(newFood)
//            binding.addFoodTxt.text.clear()
//        }
    }
}