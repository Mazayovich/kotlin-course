package org.example.kotlincourse.lesson18.Shapes

import kotlin.math.PI

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double = PI * radius * radius
}