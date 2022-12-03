package com.javakk.groovy

/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
 ***/
enum Methodologies {
    Evo(5),
    XP(21),
    Scrum(30);
    // 成员对象
    final int daysInIteration
    // 构造方法
    Methodologies(days) { daysInIteration = days }

    // ${this} 指代 enum.name(); $daysInIteration 指代成员变量
    def iterationDetails() {
        println "${this} recommends $daysInIteration days for iteration"
    }
}

for (methodology in Methodologies.values()) {
    methodology.iterationDetails()
}

