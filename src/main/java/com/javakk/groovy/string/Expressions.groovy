package com.javakk.groovy.string

/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
 ***/
println "//" + "START:EXPRESSION_OUTPUT"
value = 12
// 使用了转义字符(\)来打印$符号
println "He paid \$${value} for that."
println "//" + "END:EXPRESSION_OUTPUT"

println "//" + "START:EVALUATE_OUTPUT"
what = new StringBuilder('fence')
text = "The cow jumped over the $what"
println text

// 修改对象本身是有效的，若只修改引用则无效
what.replace(0, 5, "moon")
println text
println "//" + "END:EVALUATE_OUTPUT"

println "//" + "START:CLASS_OUTPUT"

def printClassInfo(obj) {
    println "class: ${obj.getClass().name}"
    println "superclass: ${obj.getClass().superclass.name}"
}

val = 125
// Groovy并不会简单地因为使用了双引号或正斜杠就创建一个GString实例
// GString
printClassInfo("The Stock closed at ${val}")
// GString
printClassInfo(/The Stock closed at ${val}/)
printClassInfo("This is a simple String")

println "//" + "END:CLASS_OUTPUT"

