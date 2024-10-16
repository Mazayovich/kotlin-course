package org.example.kotlincourse.lesson12

// Задача 1
fun multiplyByTwo(number: Int): Int = number * 2

// Задача 2
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// Задача 3
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

// Задача 4
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) return number
    }
    return null
}

// Задача 5
fun processList(strings: List<String?>) {
    for (string in strings) {
        if (string == null) return
        println(string)
    }
}
