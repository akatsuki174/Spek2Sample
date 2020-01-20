package com.example.spek2sample

import org.junit.Assert
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object FizzBuzzSpec : Spek({
    val fizzBuzz = FizzBuzz()

    describe("FizzBuzz method") {
        context("when enter 2") {
            it("should return 2") {
                Assert.assertEquals("2", fizzBuzz.fizzBuzz(2))
            }
        }
        context("when enter 3") {
            it("should return 'Fizz'") {
                Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(3))
            }
        }
        context("when enter 5") {
            it("should return 'Buzz'") {
                Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(5))
            }
        }
        context("when enter 15") {
            it("should return 'Fizz Buzz'") {
                Assert.assertEquals("Fizz Buzz", fizzBuzz.fizzBuzz(15))
            }
        }
    }
})
