package com.example.recycleview_app

import kotlin.random.Random

data class Fruit(
    val name:String,
    val origin:String,
    val quantity:Int
) {
    companion object{
        @JvmField
        val FRUIT_Names = arrayOf(
            "Apple","Mango","PineApple","Strawberry",
            "Banana","Kiwi","Orange","Grapes"
        )
        @JvmField
        val ORIGINS = arrayOf(
            "LuckNow","Nagpur","Srinagar","Patna","Kerala"
        )
        @JvmStatic
        fun gerRandomFruit(n:Int):ArrayList<Fruit>{
            val fruitArray = ArrayList<Fruit>(n)

            for( i in 1..n){
                fruitArray.add(
                    Fruit(
                    FRUIT_Names[Random.nextInt(8)],
                    ORIGINS[Random.nextInt(5)],
                    Random.nextInt(10)*1000
                    )
                )
            }


            return fruitArray
        }
    }

}