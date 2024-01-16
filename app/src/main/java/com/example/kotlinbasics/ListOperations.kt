package com.example.kotlinbasics

fun main() {

    val fruitsList = mutableListOf("Apple", "Banana", "Strawberry", "Lemon", "Orange")
    println(fruitsList)

    fruitsList.add("Raspberry")
    println(fruitsList)
    fruitsList.remove("Raspberry")
    println(fruitsList)
    val hasLemon = fruitsList.contains("Lemon")
    if (hasLemon) {
        println("The list has lemon.")
    } else {
        println("The list does not have lemon.")
    }

}