package org.example.kotlincourse.lesson15.homework

class Emotion(val type: String, var intensity: Int) {
fun express() {
    println("Твоя эмоция: $type, а ее интенсивность - $intensity! Хорошего дня!")
}
}