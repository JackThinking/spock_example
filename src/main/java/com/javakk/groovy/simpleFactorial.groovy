package com.javakk.groovy

/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
 ***/
// 原始递归
def factorial(BigInteger number) {
    if (number == 1) 1 else number * factorial(number - 1)
}

try {
    println "factorial of 5 is ${factorial(5)}"
    println "Number of bits in the result is ${factorial(5000).bitCount()}"
} catch (Throwable ex) {
    println "Caught ${ex.class.name}"
}

