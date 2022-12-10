package com.javakk.groovy.mop

/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
 ***/
// 对外部类直接赋予
Integer.metaClass.invokeMethod = { String name, args ->
    System.out.println("Call to $name intercepted on $delegate... ")

    def validMethod = Integer.metaClass.getMetaMethod(name, args)
    if (validMethod == null) {
        // 注意是 delegate
        Integer.metaClass.invokeMissingMethod(delegate, name, args)
    } else {
        // 前置拦截
        System.out.println("running pre-filter... ")
        // 环拦截
        result = validMethod.invoke(delegate, args) // Remove this for around-advice
        // 后置拦截
        System.out.println("running post-filter... ")
        result
    }
}

println 5.floatValue()
println 5.intValue()
try {
    println 5.empty()
} catch (Exception ex) {
    println ex
}
