package com.javakk.groovy

/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
 ***/
println "//" + "START:LITERALOUTPUT"
println 'He said, "That is Groovy"'
println "//" + "END:LITERALOUTPUT"

println "//" + "START:CLASSOUTPUT"
str = 'A string'
println str.getClass().name
println "//" + "END:CLASSOUTPUT"

// "" 表达式求值，''不行
println "//" + "START:EXPRESSION_OUTPUT"
value = 25
println 'The value is ${value}'
println "//" + "END:EXPRESSION_OUTPUT"

// 和 Java 一样是不可变对象
println "//" + "START:INDEX_OUTPUT"
str = 'hello'
println str[2]
try {
    str[2] = '!'
} catch (Exception ex) {
    println ex
}
println "//" + "END:INDEX_OUTPUT"

