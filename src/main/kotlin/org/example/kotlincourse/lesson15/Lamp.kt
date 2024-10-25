package org.example.kotlincourse.lesson15

class Lamp(var isOn: Boolean) {
    fun switch() {
        isOn = !isOn
        println(isOn)
    }
}
