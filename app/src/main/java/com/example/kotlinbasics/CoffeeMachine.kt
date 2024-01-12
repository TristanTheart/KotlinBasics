package com.example.kotlinbasics

data class coffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

fun main() {
    val coffeeTristan = coffeeDetails(3, "Tristan", "XXL", 0)
    makeCoffee(coffeeTristan)
}

fun askCoffeeDetails() {
    println("Who is this coffee for?")
    val name = readln()
    println("How much sugar do you want")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

}

//Define Function
fun makeCoffee(coffeeDetails: coffeeDetails) {
    when (coffeeDetails.sugarCount) {
        1 -> {
            println(
                "An ${coffeeDetails.size} Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}"
            )
        }
        0 -> {
            println("An ${coffeeDetails.size} Coffee with no sugar for ${coffeeDetails.name}")
        }
        else -> {
            println(
                "An ${coffeeDetails.size} Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}"
            )
        }
    }


}