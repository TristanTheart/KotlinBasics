package com.example.kotlinbasics

fun main(){
    //Immutable list - you cannot add items after init
    //val shoppingList = listOf("CPU", "RAM" , "GPU" , "SSD")
    //Mutable List - you can add/modify items
    val shoppingList = mutableListOf("CPU", "RAM" , "GPU RTX 3060" , "SSD")
    shoppingList.add("HSF")
    shoppingList.remove("GPU RTX 3060")
    shoppingList.add("GPU RTX 4060")

    println(shoppingList)
    shoppingList.add("RAM")
    println(shoppingList[3])
shoppingList.remove("GPU RTX 4060")
    shoppingList[3] = "RX 7800XT"
    println(shoppingList)
    shoppingList.set(1,"Water Cooling")
    println(shoppingList)


}
