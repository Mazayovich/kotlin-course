package org.example.kotlincourse.lesson11

package org.example.kotlincourse.lesson11

fun main() {
    // Задание 1: Создание Пустого Словаря
    val emptyMap: Map<Int, Int> = mapOf<Int, Int>()

    // Задание 2: Создание и Инициализация Словаря
    val floatDoubleMap: Map<Float, Double> = mapOf(1.1f to 2.2, 3.3f to 4.4, 5.5f to 6.6)

    // Задание 3: Создание Изменяемого Словаря
    val mutableIntStringMap = mutableMapOf<Int, String>()

    // Задание 4: Добавление Элементов в Словарь
    mutableIntStringMap[1] = "one"
    mutableIntStringMap[2] = "two"

    // Задание 5: Получение Значений из Словаря
    println(mutableIntStringMap[1]) // Ожидается: "one"
    println(mutableIntStringMap[3]) // Ожидается: null, так как ключа 3 нет

    // Задание 6: Удаление Элементов из Словаря
    mutableIntStringMap.remove(2)

    // Задание 7: Перебор Словаря в Цикле
    val doubleIntMap: Map<Double, Int> = mapOf(10.0 to 2, 20.0 to 0, 30.0 to 3)
    for ((key, value) in doubleIntMap) {
        if (value == 0) {
            println("бесконечность")
        } else {
            println(key / value)
        }
    }

    // Задание 8: Перезапись Элементов Словаря
    mutableIntStringMap[1] = "ONE"

    // Задание 9: Сложение Двух Словарей
    val map1 = mapOf(1 to "a", 2 to "b")
    val map2 = mapOf(3 to "c", 4 to "d")
    val combinedMap = mutableMapOf<Int, String>()
    for ((key, value) in map1) {
        combinedMap[key] = value
    }
    for ((key, value) in map2) {
        combinedMap[key] = value
    }

    // Задание 10: Словарь с Сложными Типами
    val complexMap: MutableMap<String, List<Int>> = mutableMapOf()
    complexMap["List1"] = listOf(1, 2, 3)
    complexMap["List2"] = listOf(4, 5, 6)

    // Задание 11: Использование Множества в Качестве Значения
    val setMap: MutableMap<Int, MutableSet<String>> = mutableMapOf()
    setMap[1] = mutableSetOf("apple", "banana")
    setMap[2] = mutableSetOf("cherry")
    setMap[1]?.add("orange")
    println(setMap[1])

    // Задание 12: Поиск Элемента по Значению
    val pairMap: Map<Pair<Int, Int>, String> = mapOf((5 to 2) to "found", (3 to 5) to "also found", (7 to 8) to "not found")
    for ((key, value) in pairMap) {
        if (key.first == 5 || key.second == 5) {
            println(value)
        }
    }
}
