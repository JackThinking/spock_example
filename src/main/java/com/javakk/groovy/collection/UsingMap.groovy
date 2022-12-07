package com.javakk.groovy.collection

/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
 ***/
// 默认是java.util.LinkedHashMap
println "//" + "START:CREATEHASHMAPOUTPUT"
langs = ['C++': 'Stroustrup', 'Java': 'Gosling', 'Lisp': 'McCarthy']

println langs.getClass().name
println "//" + "END:CREATEHASHMAPOUTPUT"

// 类似与 Python 的键值对获取方式
println "//" + "START:INDEXOUTPUT"
println langs['Java']
println langs['C++']
println "//" + "END:INDEXOUTPUT"

// 甚至还可以当做属性来调用
println "//" + "START:PROPERTYOUTPUT"
println langs.Java
println "//" + "END:PROPERTYOUTPUT"

// 但是也有很大的坑，容易和一些关键字冲突
try {
    println "//" + "START:CPPOUTPUT"
    println langs.C++ // Invalid code
} catch (Exception ex) {
    println ex
    println "//" + "END:CPPOUTPUT"
}

println "//" + "START:CPPAGAINOUTPUT"
println langs.'C++'
println "//" + "END:CPPAGAINOUTPUT"

println "//" + "START:CREATEHASH_NOQUOTE"
langs = ['C++': 'Stroustrup', Java: 'Gosling', Lisp: 'McCarthy']

println langs
println "//" + "END:CREATEHASH_NOQUOTE"

