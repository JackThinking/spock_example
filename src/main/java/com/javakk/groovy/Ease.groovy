package com.javakk.groovy

def foo(str) {
//if (str != null) { str.reverse()}
    str?.reverse()
}

println foo("evil")
// 没有抛出空指针异常，这是Groovy减少噪音、节省开发者力气的另一手段。
println foo(null)
