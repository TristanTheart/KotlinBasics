package com.example.kotlinbasics

fun main(){
    println("Please enter a number : ")
    var inputString = readln()
    var inputNumber = inputString.toInt()
    val multiplier = 5

    val result = inputNumber*multiplier
    println("Result of operation is: $result")
}