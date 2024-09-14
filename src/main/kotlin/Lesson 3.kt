package org.example

import javax.lang.model.element.Name

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

