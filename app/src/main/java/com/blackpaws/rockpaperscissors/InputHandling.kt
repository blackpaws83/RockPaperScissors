package com.blackpaws.rockpaperscissors

fun main() {
    println("Please enter a number: ")
    var inputString = readln()
    var inputNumber = 0
    while (true)
        try {
            inputNumber = inputString.toInt()
            break
        } catch (e: NumberFormatException) {
            println("Please enter a valid whole number: ")
            inputString = readln()
        }
    println("Your number is: $inputNumber")
    val multiplier = 5
    println("Your number is going to be multiplied by multiplier $multiplier")
    println("Result of operation is: $inputNumber * $multiplier = " + inputNumber * multiplier)
}