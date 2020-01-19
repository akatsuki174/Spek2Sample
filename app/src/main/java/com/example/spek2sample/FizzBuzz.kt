package com.example.spek2sample

class FizzBuzz {
    fun fizzBuzz(num: Int): String {
        return when {
            num % 15 == 0 -> "Fizz Buzz"
            num % 3 == 0 -> "Fizz"
            num % 5 == 0 -> "Buzz"
            else -> num.toString()
        }
    }
}
