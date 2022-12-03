package com.javakk.groovy

class Robot {
    def type, height, width

    def access(location, weight, fragile) {
        println "Received fragile? $fragile, weight: $weight, loc: $location"
    }
}

robot = new Robot(type: 'arm', width: 10, height: 40)
println "$robot.type, $robot.height, $robot.width"

robot.access(x: 30, y: 20, z: 10, 50, true)
//You can change the order
robot.access(50, true, x: 30, y: 20, z: 10)

def access(Map location, weight, fragile) {
    print "Received fragile? $fragile, weight: $weight, loc: $location"
}

def (String cat, String mouse) = ['Tom', 'Jerry', 'Spike', 'Tyke']
println "$cat and $mouse"

def (String first, String second, String third) = ['Tom', 'Jerry', 'Spike', 'Tyke']
println "$first , $second and $third"

