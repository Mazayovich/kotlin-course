package org.example.kotlincourse.lesson10

// Тестирование функций
fun main() {
    // тест]1
    println(createEmptyIntList()) // Задание 1
    println(createInitializedStringList()) // Задание 2

    val mutableList = createMutableIntList() // Задание 3
    println(mutableList)

    addElementsToMutableList(mutableList) // Задание 4
    println(mutableList)

    val stringList = mutableListOf("Hello", "World", "Kotlin") // Пример для Задания 5
    println(removeElementFromList(stringList, "World")) // Задание 5

    printIntListElements(mutableList) // Задание 6

    println(getSecondElementFromStringList(createInitializedStringList())) // Задание 7

    updateElementInMutableList(mutableList, 2, 10) // Задание 8
    println(mutableList)

    val mergedList = mergeStringLists(listOf("A", "B"), listOf("C", "D")) // Задание 9
    println(mergedList)

    val (min, max) = findMinMaxInIntList(listOf(1, 2, 3, 4, 5)) // Задание 10
    println("Min: $min, Max: $max")

    val evenNumbers = filterEvenNumbers(listOf(1, 2, 3, 4, 5, 6)) // Задание 11
    println(evenNumbers)
}



// Задание 1: Создание Пустого Списка
fun createEmptyIntList(): List<Int> {
    return listOf()
}

// Задание 2: Создание и Инициализация Списка
fun createInitializedStringList(): List<String> {
    return listOf("Hello", "World", "Kotlin")
}

// Задание 3: Создание Изменяемого Списка
fun createMutableIntList(): MutableList<Int> {
    return mutableListOf(1, 2, 3, 4, 5)
}

// Задание 4: Добавление Элементов в Список
fun addElementsToMutableList(list: MutableList<Int>): MutableList<Int> {
    list.add(6)
    list.add(7)
    list.add(8)
    return list
}

// Задание 5: Удаление Элементов из Списка
fun removeElementFromList(list: MutableList<String>, element: String): MutableList<String> {
    list.remove(element)
    return list
}

// Задание 6: Перебор Списка в Цикле
fun printIntListElements(list: List<Int>) {
    for (element in list) {
        println(element)
    }
}

// Задание 7: Получение Элементов Списка по Индексу
fun getSecondElementFromStringList(list: List<String>): String? {
    return if (list.size > 1) list[1] else null
}

// Задание 8: Перезапись Элементов Списка по Индексу
fun updateElementInMutableList(list: MutableList<Int>, index: Int, newValue: Int): MutableList<Int> {
    if (index in list.indices) {
        list[index] = newValue
    }
    return list
}

// Задание 9: Объединение Двух Списков
fun mergeStringLists(list1: List<String>, list2: List<String>): List<String> {
    val mergedList = mutableListOf<String>()
    for (item in list1) {
        mergedList.add(item)
    }
    for (item in list2) {
        mergedList.add(item)
    }
    return mergedList
}

// Задание 10: Нахождение Минимального/Максимального Элемента
fun findMinMaxInIntList(list: List<Int>): Pair<Int?, Int?> {
    var min: Int? = null
    var max: Int? = null
    for (element in list) {
        if (min == null || element < min) min = element
        if (max == null || element > max) max = element
    }
    return Pair(min, max)
}

// Задание 11: Фильтрация Списка
fun filterEvenNumbers(list: List<Int>): List<Int> {
    val evenList = mutableListOf<Int>()
    for (element in list) {
        if (element % 2 == 0) {
            evenList.add(element)
        }
    }
    return evenList
}

