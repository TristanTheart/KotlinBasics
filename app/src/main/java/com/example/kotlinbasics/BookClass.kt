package com.example.kotlinbasics


fun main() {
    val myBook = Book()
    val customBook = Book("Autism", "Tristan Theart", 2024)
    println("My title is ${myBook.title}\nthe author is  ${myBook.author}\nand it was published in ${myBook.yearPublished}\n")
    println("My title is ${customBook.title}\nthe author is ${customBook.author}\nand it was published in ${customBook.yearPublished}\n")

}
