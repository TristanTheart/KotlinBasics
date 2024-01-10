package com.example.kotlinbasics

fun main(){

    var age = 21

    // Comparison operators
    // greater than >
    // less than <
    // greater equal >=
    // less equal <=
    // equal ==
    println("Please enter your age as a whole number")
    // Read what the user has entered into the console
     val enteredValue = readln()
    // convert the str var into int var
     age = enteredValue.toInt()
        if(age in 18..39){
        println("You can enter")
            }else if(age >= 40){
            println("You are too old!")
                 }else{
                println("You are too young to go into the club!")


    }
}