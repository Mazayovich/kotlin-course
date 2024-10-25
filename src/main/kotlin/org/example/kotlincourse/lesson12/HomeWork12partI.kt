package org.example.kotlincourse.lesson12

// Функция, которая не принимает аргументов и не возвращает значения
fun doNothing() {
    println("Doing nothing")
}

// Функция, которая принимает два целых числа и возвращает их сумму
//fun sum(a: Int, b: Int): Int {
   // return a + b
// }


// Функция, которая принимает строку и ничего не возвращает
fun printString(value: String) {
    println(value)
}

// Функция, которая принимает список целых чисел и возвращает среднее значение типа Double
fun calculateAverage(numbers: List<Int>): Double {
    return numbers.average()
}

// Функция, которая принимает nullable строку и возвращает её длину в виде nullable целого числа
fun getStringLength(value: String?): Int? {
    return value?.length
}

// Функция, которая не принимает аргументов и возвращает nullable вещественное число
fun getNullableDouble(): Double? {
    return null
}

// Функция, которая принимает nullable список целых чисел и не возвращает значения
fun processNullableList(numbers: List<Int>?) {
    println("Processing list: $numbers")
}

// Функция, которая принимает целое число и возвращает nullable строку
fun convertToString(value: Int): String? {
    return value.toString()
}

// Функция, которая не принимает аргументов и возвращает список nullable строк
fun getNullableStringList(): List<String?> {
    return listOf(null, "example")
}

// Функция, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение
fun checkNullableConditions(text: String?, number: Int?): Boolean? {
    return text?.isNotEmpty() == true && number != null
}
