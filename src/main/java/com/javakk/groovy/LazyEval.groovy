package com.javakk.groovy

/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
 ***/
println "//" + "START:EVALUATE_OUTPUT"
what = new StringBuilder('fence')
text = "The cow jumped over the $what"
println text

// 修改对象本身会生效
what.replace(0, 5, "moon")
println text
println "//" + "END:EVALUATE_OUTPUT"

println "//" + "START:PROBLEM_OUTPUT"
price = 684.71
company = 'Google'
quote = "Today $company stock closed at $price"
println quote

// 下面的遍历修改了引用，实际不会生效
stocks = [Apple: 663.01, Microsoft: 30.95]

stocks.each { key, value ->
    company = key
    price = value
    println quote
}

println "//" + "END:PROBLEM_OUTPUT"

println "//" + "START:FIX1_OUTPUT"

// 通过闭包的扩展点可以实现
// 如果GString中包含的是一个闭包，而非变量，该闭包就会被调用。如果闭包接收一个参数，GString会把Writer对象当作一个参数发送给它
companyClosure = { it.write(company) }
priceClosure = { it.write("$price") }
quote = "Today ${companyClosure} stock closed at ${priceClosure}"
stocks.each { key, value ->
    company = key
    price = value
    println quote
}

println "//" + "END:FIX1_OUTPUT"

println "//" + "START:FIX2_OUTPUT"

// 如前文所述，如果闭包没有任何参数，可以去掉it参数，GString会使用我们返回的内容。
companyClosure = { -> company }
priceClosure = { -> "$price" }
quote = "Today ${companyClosure} stock closed at ${priceClosure}"
stocks.each { key, value ->
    company = key
    price = value
    println quote
}

println "//" + "END:FIX2_OUTPUT"

println "//" + "START:FIX_OUTPUT"

// 不想单独定义闭包。对于这种简单情形，我们希望代码是自包含的
quote = "Today ${-> company} stock closed at ${-> "$price"}"

stocks.each { key, value ->
    company = key
    price = value
    println quote
}

println "//" + "END:FIX_OUTPUT"
