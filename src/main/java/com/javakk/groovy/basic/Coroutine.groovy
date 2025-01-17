package com.javakk.groovy.basic

/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
 ***/
def iterate(n, closure) {
    1.upto(n) {
        println "In iterate with value ${it}"
        closure(it)
    }
}

println "Calling iterate"
total = 0
iterate(4) {
    // total 是外部引用，其数据在一直被修改
    // it 是 iterate() 里的迭代器传进值
    total += it
    // ${total} 是字符形式下对变量的引用
    println "In closure total so far is ${total}"
}
println "Done"

