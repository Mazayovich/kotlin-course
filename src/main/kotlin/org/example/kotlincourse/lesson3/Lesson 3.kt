package org.example.org.example.kotlincourse.lesson3

val Name: String = "Xenia"
var age: Double = 30.0
const val PI: Double = 3.14
lateinit var userInfo: String
val lazyValue: String by lazy {
    "Hello this is a lazy string!"
}

var speed: Double? = null

var count: Int = 0
    get() {
        return field
    }
    set(value) {
        if (value >= 0) field = value
        else field = 100
    }

fun countUp() {
    count = 1
}

val chassis: String = "1234abc" // номер
var color: String = "blue" //цвет
var distance: Double = 0.0 //пробег
lateinit var owner: String //владелец
const val WHEELS: Int = 4 // кол-во колес
val report: String by lazy {
    ""
}
var fuel: Double = 0.0 //масло в баке
    get() = field
    set(value) {
        if (value > 0) field +=value
    }
