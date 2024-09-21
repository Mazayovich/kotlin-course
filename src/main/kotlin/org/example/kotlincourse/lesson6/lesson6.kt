package org.example.kotlincourse.lesson6

//Условные операторы

fun main() {

val intRange: IntRange = 1..10
val intRangeUntil = 1 until 10
val downTo = 10 downTo 1
val charRange: CharRange = 'd'..'s' // диапазон символов от кода д до кода с


val inRange = 2 in intRange
val notInRange = 20 !in intRange

    println(inRange)
    println(notInRange)

val score = 34
    when (score) {
    in 90..100 -> println("Отлично")
        in 80..89 -> println("Хорошо")
        in 70..79 -> println("Удовлетворительно")
        else -> println("Нужно подучить")

    }

fun getTimesOfDay(hour: Int): String {
return when {
hour < 0 || hour > 23 -> "Неверное значение времени"
hour in 0..4 -> "Ночь"
hour in 5..11 -> "Утро"
hour in 12..16 -> "День"
else -> "Вечер"
}

}






}



