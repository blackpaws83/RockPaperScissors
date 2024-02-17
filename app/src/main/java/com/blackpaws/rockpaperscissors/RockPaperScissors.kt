package com.blackpaws.rockpaperscissors

fun main() {

    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper or Scissors? Enter your choice.")
    while (true) {
        playerChoice = readln()
        if (
            playerChoice.lowercase() == "rock" ||
            playerChoice.lowercase() == "paper" ||
            playerChoice.lowercase() == "scissors"
            ) {
            break
        }
        println("Please enter \"Rock\", \"Paper\", or \"Scissors\"")
    }


    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
    }
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player wins"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player wins"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player wins"
        else -> "Computer wins"
    }
    println(winner)
}