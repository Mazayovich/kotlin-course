package org.example.kotlincourse.lesson10


// теест!!
fun main() {
    // Тестируем задания
    println(createEmptyIntSet()) // Задание 1
    println(createInitializedIntSet()) // Задание 2

    val mutableSet = createMutableStringSet() // Задание 3
    println(mutableSet)

    addElementsToStringSet(mutableSet) // Задание 4
    println(mutableSet)

    val intSet = mutableSetOf(1, 2, 3, 4) // Пример для Задания 5
    println(removeElementFromIntSet(intSet, 2)) // Задание 5

    printIntSetElements(intSet) // Задание 6

    val stringSet = setOf("Kotlin", "Java") // Пример для Задания 7
    println(checkStringInSet(stringSet, "Java")) // Задание 7

    val set1 = setOf("A", "B") // Пример для Задания 8
    val set2 = setOf("B", "C")
    println(mergeStringSets(set1, set2)) // Задание 8

    val intSet1 = setOf(1, 2, 3) // Пример для Задания 9
    val intSet2 = setOf(2, 3, 4)
    println(findIntersectionOfSets(intSet1, intSet2)) // Задание 9

    val stringSet1 = setOf("A", "B", "C") // Пример для Задания 10
    val stringSet2 = setOf("B", "D")
    println(findDifferenceOfSets(stringSet1, stringSet2)) // Задание 10

    val stringSet3 = setOf("Kotlin", "Java") // Пример для Задания 11
    println(convertSetToList(stringSet3)) // Задание 11
}

// Задание 1: Создание Пустого Множества
fun createEmptyIntSet(): Set<Int> {
    return setOf()
}

// Задание 2: Создание и Инициализация Множества
fun createInitializedIntSet(): Set<Int> {
    return setOf(1, 2, 3)
}

// Задание 3: Создание Изменяемого Множества
fun createMutableStringSet(): MutableSet<String> {
    return mutableSetOf("Kotlin", "Java", "Scala")
}

// Задание 4: Добавление Элементов в Множество
fun addElementsToStringSet(set: MutableSet<String>): MutableSet<String> {
    set.add("Swift")
    set.add("Go")
    return set
}

// Задание 5: Удаление Элементов из Множества
fun removeElementFromIntSet(set: MutableSet<Int>, element: Int): MutableSet<Int> {
    set.remove(element)
    return set
}

// Задание 6: Перебор Множества в Цикле
fun printIntSetElements(set: Set<Int>) {
    for (element in set) {
        println(element)
    }
}

// Задание 7: Проверка Наличия Элемента в Множестве
fun checkStringInSet(set: Set<String>, string: String): Boolean {
    for (element in set) {
        if (element == string) {
            return true
        }
    }
    return false
}

// Задание 8: Объединение Двух Множеств
fun mergeStringSets(set1: Set<String>, set2: Set<String>): Set<String> {
    val mergedSet = mutableSetOf<String>()
    for (item in set1) {
        mergedSet.add(item)
    }
    for (item in set2) {
        mergedSet.add(item)
    }
    return mergedSet
}

// Задание 9: Нахождение Пересечения Множеств
fun findIntersectionOfSets(set1: Set<Int>, set2: Set<Int>): Set<Int> {
    val intersectionSet = mutableSetOf<Int>()
    for (item1 in set1) {
        for (item2 in set2) {
            if (item1 == item2) {
                intersectionSet.add(item1)
            }
        }
    }
    return intersectionSet
}

// Задание 10: Нахождение Разности Множеств
fun findDifferenceOfSets(set1: Set<String>, set2: Set<String>): Set<String> {
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
    return differenceSet
}

// Задание 11: Конвертация Множества в Список
fun convertSetToList(set: Set<String>): List<String> {
    val list = mutableListOf<String>()
    for (element in set) {
        list.add(element)
    }
    return list
}

