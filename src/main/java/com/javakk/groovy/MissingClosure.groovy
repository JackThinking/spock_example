package com.javakk.groovy

/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
 ***/
// 帮助做兜底逻辑
def doSomeThing(closure) {
    // 自带 null 判定
    if (closure) {
        closure()
    } else {
        println "Using default implementation"
    }
}

doSomeThing() { println "Use specialized implementation" }

doSomeThing()

