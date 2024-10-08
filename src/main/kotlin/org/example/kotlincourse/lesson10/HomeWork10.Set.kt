package org.example.kotlincourse.lesson10

fun main() {
    createEmptyIntSet()            // Задание 1
    createInitializedIntSet()       // Задание 2
    createMutableStringSet()        // Задание 3
    addElementsToStringSet()        // Задание 4
    removeElementFromIntSet()       // Задание 5
    printIntSetElements()           // Задание 6
    checkStringInSet()              // Задание 7
    mergeStringSets()               // Задание 8
    findIntersectionOfSets()        // Задание 9
    findDifferenceOfSets()          // Задание 10
    convertSetToList()              // Задание 11
}

// Задание 1: Создание Пустого Множества
fun createEmptyIntSet() {
    val emptySet = setOf<Int>()
    println(emptySet)
}

// Задание 2: Создание и Инициализация Множества
fun createInitializedIntSet() {
    val initializedSet = setOf(1, 2, 3)
    println(initializedSet)
}

// Задание 3: Создание Изменяемого Множества
fun createMutableStringSet() {
    val mutableSet = mutableSetOf("Kotlin", "Java", "Scala")
    println(mutableSet)
}

// Задание 4: Добавление Элементов в Множество
fun addElementsToStringSet() {
    val mutableSet = mutableSetOf("Kotlin", "Java", "Scala")
    mutableSet.add("Swift")
    mutableSet.add("Go")
    println(mutableSet)
}

// Задание 5: Удаление Элементов из Множества
fun removeElementFromIntSet() {
    val intSet = mutableSetOf(1, 2, 3, 4)
    intSet.remove(2)
    println(intSet)
}

// Задание 6: Перебор Множества в Цикле
fun printIntSetElements() {
    val set = setOf(1, 2, 3, 4)
    for (element in set) {
        println(element)
    }
}

// Задание 7: Проверка Наличия Элемента в Множестве
fun checkStringInSet() {
    val set = setOf("Kotlin", "Java")
    val searchString = "Java"
    var found = false
    for (element in set) {
        if (element == searchString) {
            found = true
            break
        }
    }
    println(found)
}

// Задание 8: Объединение Двух Множеств
fun mergeStringSets() {
    val set1 = setOf("A", "B")
    val set2 = setOf("B", "C")
    val mergedSet = mutableSetOf<String>()

    for (item in set1) {
        mergedSet.add(item)
    }
    for (item in set2) {
        mergedSet.add(item)
    }
    println(mergedSet)
}

// Задание 9: Нахождение Пересечения Множеств
fun findIntersectionOfSets() {
    val set1 = setOf(1, 2, 3)
    val set2 = setOf(2, 3, 4)
    val intersectionSet = mutableSetOf<Int>()

    for (item1 in set1) {
        for (item2 in set2) {
            if (item1 == item2) {
                intersectionSet.add(item1)
            }
        }
    }
    println(intersectionSet)
}

// Задание 10: Нахождение Разности Множеств
fun findDifferenceOfSets() {
    val set1 = setOf("A", "B", "C")
    val set2 = setOf("B", "D")
    val differenceSet = mutableSetOf<String>()

    for (item1 in set1) {
        var found = false
        for (item2 in set2) {
            if (item1 == item2) {
                found = true
                break
            }
        }
        if (!found) {
            differenceSet.add(item1)
        }
    }
    println(differenceSet)
}

// Задание 11: Конвертация Множества в Список
fun convertSetToList() {
    val set = setOf("Kotlin", "Java")
    val list = mutableListOf<String>()

    for (element in set) {
        list.add(element)
    }
    println(list)
}

// Тестирование всех функций
