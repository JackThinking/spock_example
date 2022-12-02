package com.javakk.groovy

class Car {
    def miles = 0
    // final 定义的变量只能构造函数赋值
    final year

    Car(theYear) {
        year = theYear
    }
}

Car car = new Car(2008)

println "Year:$car.year"
println "Miles:$car.miles"
println "Setting miles"
car.miles = 25
println "Miles:$car.miles"