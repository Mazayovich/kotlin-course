package org.example.kotlincourse.lesson18.Shapes

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(3.0),
        Square(4.0),
        Triangle(5.0, 6.0, 45.0)
    )
    shapes.forEach { shape -> println("Area: ${shape.area()}") }
}

