package com.example.kotlinbasics

fun main(){


    print("Enter your age as a whole number: ")
    val enteredValue = readln()
    var age = enteredValue.toInt()
    if(age in 18..39){
        println("You may enter the club")
    }else if(age >= 40){
        println("You are too old!")
    }else{
        println("You are too young")
    }

}