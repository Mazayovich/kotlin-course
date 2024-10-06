package org.example.kotlincourse.lesson10

// Тестирование функций
fun main() {
    // тест!
    println(createAndInitializeArray().toList())
    println(createEmptyStringArray().toList())
    println(fillDoubleArray().toList())
    println(fillIntArrayWithIndexTimesThree().toList())
    println(createNullableStringArray().toList())

    val originalArray = arrayOf(1, 2, 3, 4, 5)
    println(copyArray(originalArray).toList())

    val array1 = arrayOf(10, 20, 30)
    val array2 = arrayOf(1, 2, 3)
    println(subtractArrays(array1, array2).toList())

    println(findIndexOfFive(arrayOf(1, 5, 3, 7, 9)))

    printEvenOrOdd(arrayOf(1, 2, 3, 4, 5))

    println(findSubstring(arrayOf("hello", "world", "test"), "wo"))
}



// Задание 1: Создание и Инициализация Массива
fun createAndInitializeArray(): Array<Int> {
    return arrayOf(1, 2, 3, 4, 5)
}

// Задание 2: Создание Пустого Массива
fun createEmptyStringArray(): Array<String> {
    return Array(10) { "" }
}

// Задание 3: Заполнение Массива в Цикле
fun fillDoubleArray(): Array<Double> {
    val doubleArray = Array(5) { 0.0 }
    for (i in doubleArray.indices) {
        doubleArray[i] = i * 2.0
    }
    return doubleArray
}

// Задание 4: Изменение Элементов Массива
fun fillIntArrayWithIndexTimesThree(): Array<Int> {
    val intArray = Array(5) { 0 }
    for (i in intArray.indices) {
        intArray[i] = i * 3
    }
    return intArray
}

// Задание 5: Работа с Nullable Элементами
fun createNullableStringArray(): Array<String?> {
    return arrayOf(null, "Hello", "World")
}

// Задание 6: Копирование Массива
fun copyArray(original: Array<Int>): Array<Int> {
    val copiedArray = Array(original.size) { 0 }
    for (i in original.indices) {
        copiedArray[i] = original[i]
    }
    return copiedArray
}

// Задание 7: Разница Двух Массивов
fun subtractArrays(array1: Array<Int>, array2: Array<Int>): Array<Int> {
    val resultArray = Array(array1.size) { 0 }
    for (i in array1.indices) {
        resultArray[i] = array1[i] - array2[i]
    }
    return resultArray
}

// Задание 8: Поиск Индекса Элемента
fun findIndexOfFive(array: Array<Int>): Int {
    var index = 0
    while (index < array.size) {
        if (array[index] == 5) {
            return index
        }
        index++
    }
    return -1
}

// Задание 9: Перебор Массива
fun printEvenOrOdd(array: Array<Int>) {
    for (element in array) {
        if (element % 2 == 0) {
            println("$element - четное")
        } else {
            println("$element - нечетное")
        }
    }
}

// Задание 10: Поиск Значения в Массиве по вхождению
fun findSubstring(array: Array<String>, substring: String): String? {
    for (element in array) {
        if (element.contains(substring)) {
            return element
        }
    }
    return null
}

