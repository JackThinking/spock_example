package com.javakk.groovy

/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
 ***/
// ~"XXX"快速生成java.util.regex.Pattern
println "//" + "START:CREATE_PATTERNOUTPUT"
obj = ~"hello"
println obj.getClass().name
println "//" + "END:CREATE_PATTERNOUTPUT"

// =~执行RegEx部分匹配
println "//" + "START:MATCHOUTPUT"
pattern = ~"(G|g)roovy"
text = 'Groovy is Hip'
if (text =~ pattern) println "match" else println "no match"

// ==~执行RegEx精确匹配
if (text ==~ pattern) println "match" else println "no match"
println "//" + "END:MATCHOUTPUT"

println "//" + "START:MATCHES_OUTPUT"
matcher = 'Groovy is groovy' =~ /(G|g)roovy/
print "Size of matcher is ${matcher.size()} "
println "with elements ${matcher[0]} and ${matcher[1]}."
println "//" + "END:MATCHES_OUTPUT"

println "//" + "START:REPLACE_OUTPUT"
str = 'Groovy is groovy, really groovy'
println str
result = (str =~ /groovy/).replaceAll('hip')
println result
println "//" + "END:REPLACE_OUTPUT"

