package com.example.handin2

import java.time.Year

/// 1

open class Employee (firstname: String, lastname: String, monthlySalary: Int) {
   private var _monthlySalary: Int = monthlySalary

    var monthlySalary: Int
        get () {
return _monthlySalary
        }
        set(value: Int) {
if (value>0) {
    _monthlySalary = value
}
else {
_monthlySalary=0
}
             }
}

// 2

open class Computer (val system:String, val ram: Int, var model:String) {

    open fun ramChecker () {
        println("Your computer has $ram ram")
    }
    open fun systemChecker () {
        println("The system are $system")
    }

}

class Laptop (system: String,ram: Int,model: String,val size:Int):Computer(system,ram,model) {
    override fun ramChecker() {
        println("Your computer has $ram")
    }
    fun sizeofScreen () {
        println(size)
    }

    }

class SmartPhone (system: String,ram: Int,model:String,): Computer(system,ram,model)

// 3

open class Product (name:String,price:Int,quantity:Int) {
    open fun identifyProductCategory () {
        println("I am product")
    }
}
class Shoe:Product("Nike",500,10) {
    override fun identifyProductCategory() {
        println("I am shoe")
    }
}

class TShirt:Product("Shirt",100,5000) {
    override fun identifyProductCategory() {
        println("I am Shirt")
    }
}
class Book:Product("Book",1000,2000) {
    override fun identifyProductCategory() {
        println("I am book")
    }
}

open class Shape(val color: String, val isTransparent: Boolean) {
    open fun calculatePerimeter(): Double {
        return 0.0
    }

    open fun calculateArea(): Double {
        return 0.0
    }
}

class Circle(val radius: Double, color: String, isTransparent: Boolean) : Shape("black", false) {
    override fun calculatePerimeter(): Double {
        return 2 * 3.14 * radius
    }

    override fun calculateArea(): Double {
        return 3.14 * radius * radius
    }
}

class Rectangle(val length: Double, val height: Double, color: String, isTransparent: Boolean) : Shape("white", false) {
    override fun calculatePerimeter(): Double {
        return 2 * (length + height)
    }

    override fun calculateArea(): Double {
        return length * height
    }
}

class Triangle(val height: Double, val base: Double, color: String, isTransparent: Boolean) : Shape("yellow", false) {
    override fun calculatePerimeter(): Double {
        return 3 * base
    }

    override fun calculateArea(): Double {
        return 0.5 * base * height
    }
}

fun main() {
val employee1 = Employee("Andreas","Buch", 1000 )
    val employee2 = Employee("Søren","Jensen",2000)
    val employee1YearlySalary = employee1.monthlySalary*12
    val employee2YearlySalary = employee2.monthlySalary*12
    println(employee1YearlySalary)
    println(employee2YearlySalary)
    val yearlyRaise1 = employee1YearlySalary*1.1
    val yearlyRaise2 = employee2YearlySalary*1.1
    println(yearlyRaise1)
    println(yearlyRaise2)

    val windows = Laptop("Windows",23, "Asus", 12)
    val iphone = SmartPhone("Apple",12,"Iphone 12")

}