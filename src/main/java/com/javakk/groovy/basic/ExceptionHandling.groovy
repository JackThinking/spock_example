package com.javakk.groovy.basic

def openFile(fileName) {
    new FileInputStream(fileName)
}

try {
    openFile("nonexistentfile")
} catch (ex) {
//关于该异常，在这里想做什么就做什么
    println "Oops：" + ex
}