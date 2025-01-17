package com.javakk.groovy.closure

/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
 ***/
def tellFortunes(closure) {
    Date date = new Date("09/20/2012")
    //closure date, "Your day is filled with ceremony"
    //closure date, "They're features, not bugs"
    // We can curry to avoid sending date repeatedly
    // 科里化减少了一个入参，都用"09/20/2012"这个对象
    postFortune = closure.curry(date)
    // 下面两个相当于执行了两次闭包函数
    postFortune "Your day is filled with ceremony"
    postFortune "They're features, not bugs"
}

// 双入参的闭包
tellFortunes() { date, fortune -> println "Fortune for ${date} is '${fortune}'"
}

