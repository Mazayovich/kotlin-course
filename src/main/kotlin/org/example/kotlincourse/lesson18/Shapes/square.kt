package org.example.kotlincourse.lesson18.Shapes

class Square(private val side: Double) : Shape() {
    override fun area(): Double = side * side
}