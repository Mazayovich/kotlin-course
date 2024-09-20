package org.example.kotlincourse.lesson4

val myInt: Int = 23456
val myFloat: Float = 0.58F
val myLong: Long = 1_234_56_78L
val myShort: Short = 3200
val myByte: Byte = 120
val myDouble: Double = 5.99
val isKotlinFun: Boolean = true
val letter: Char = '&'
val text: String = "Hello World"

//КОЛЛЕКЦИИ:

val numbers: Array<Int> = arrayOf(1, 2 , 3)
val strings: List<String> = listOf("one", "two", "three")
val string: MutableList<String> = mutableListOf("one", "two", "three")
val doubles: Set<Double> = setOf(23.3, 56.8)
val keysToValues: Map<String, String> = mapOf()

val anything: Any = false
fun printMessage(message: String){
    println(message)
}
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

