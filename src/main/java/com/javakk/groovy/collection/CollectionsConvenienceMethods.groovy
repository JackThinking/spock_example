package com.javakk.groovy.collection

/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
 ***/
println "//" + "START:COUNTOUTPUT"
lst = ['Programming', 'In', 'Groovy']

count = 0
lst.each { count += it.size() }
println count
println "//" + "END:COUNTOUTPUT"

// 相当于 Java 的 map().collect()
println "//" + "START:SUMOUTPUT"
println lst.collect { it.size() }.sum()
println "//" + "END:SUMOUTPUT"

// TODO: 较难理解，传入外部变量的 foreach 处理
println "//" + "START:INJECTOUTPUT"
println lst.inject(0) { carryOver, element -> carryOver + element.size() }
println "//" + "END:INJECTOUTPUT"

println "//" + "START:JOINOUTPUT"
println lst.join(' ')
println "//" + "END:JOINOUTPUT"

println "//" + "START:ASSIGNOUTPUT"
lst[0] = ['Be', 'Productive']
println lst
println "//" + "END:ASSIGNOUTPUT"


println "//" + "START:FLATTENOUTPUT"
lst = lst.flatten()
println lst
println "//" + "END:FLATTENOUTPUT"

println "//" + "START:MINUSOUTPUT"
println lst - ['Productive', 'In']
println "//" + "END:MINUSOUTPUT"

println "//" + "START:MEMBERPROPERTYOUTPUT"
println lst.size()
println lst*.size()
println "//" + "END:MEMBERPROPERTYOUTPUT"

println "//" + "START:EXPLODEOUTPUT"

def words(a, b, c, d) {
    println "$a $b $c $d"
}
// 加星号估计是把 list 转数组
words(*lst)
println "//" + "END:EXPLODEOUTPUT"

