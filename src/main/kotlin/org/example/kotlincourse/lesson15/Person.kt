package org.example.kotlincourse.lesson15

class Person(val name: String, var age: Int) {
    fun sayHello() {
        println("Hello $name You are $age")
    }
}
// можем указать по дефолту значения