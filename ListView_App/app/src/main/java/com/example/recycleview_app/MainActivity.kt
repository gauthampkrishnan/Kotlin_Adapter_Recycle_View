package com.example.recycleview_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item_food.*
import kotlinx.android.synthetic.main.list_item_food.view.*
import kotlinx.android.synthetic.main.list_item_food.view.tvFruitname

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fruits = Fruit.gerRandomFruit(100)
        val fruitAdapter = FruitAdapter(fruits)
        rvFruits.layoutManager = LinearLayoutManager(this)
        rvFruits.adapter = fruitAdapter


    }
}