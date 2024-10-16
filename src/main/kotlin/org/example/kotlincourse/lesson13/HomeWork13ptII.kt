@file:Suppress("UNREACHABLE_CODE")

package org.example.kotlincourse.lesson13


fun main() {
    val testCases = listOf(
        listOf(), // Пусто
        listOf(1, 2, 3), // Короткая
        listOf(0, 5, 10, 15), // Стартовая
        List(100) { 100 }, // Массивная
        listOf(5, 10, 15), // Сбалансированная
        listOf(1, 2, 3, 4, 5, 6, 7), // Клейкая
        listOf(-15, -20, -30), // Отрицательная
        listOf(1001, 2000, 3000), // Положительная
        listOf(3, 14, 20), // Пи***тая
        listOf(2, 8, 20, 30) // Уникальная
    )

    testCases.forEach {
        println("Collection: $it - Result: ${analyzeCollection(it)}")
    }
}

// Примеры вызова метода с разными коллекциями
val emptyList = listOf<Int>() // Пустая коллекция
println(analyze(emptyList)) // Ожидается: "Пусто"

val shortList = listOf(1, 2, 3) // Коллекция с менее чем 5 элементами
println(analyze(shortList)) // Ожидается: "Короткая"

val startList = listOf(0, 1, 2, 3, 4) // Коллекция, начинающаяся с 0
println(analyze(startList)) // Ожидается: "Стартовая"

val massiveList = listOf(5000, 6000, 7000) // Сумма больше 10000
println(analyze(massiveList)) // Ожидается: "Массивная"

val balancedList = listOf(10, 10, 10) // Среднее равно 10
println(analyze(balancedList)) // Ожидается: "Сбалансированная"

val stickyList = listOf(1, 2, 3, 4, 5, 6) // Длина строки 20
println(analyze(stickyList)) // Ожидается: "Клейкая"

val negativeList = listOf(-15, -20, -5) // Максимальное число < -10
println(analyze(negativeList)) // Ожидается: "Отрицательная"

val positiveList = listOf(1001, 2000) // Минимальное число > 1000
println(analyze(positiveList)) // Ожидается: "Положительная"

val mixedList = listOf(3, 14, 5) // Содержит 3 и 14
println(analyze(mixedList)) // Ожидается: "Пи***тая"

val uniqueList = listOf(1, 2, 5) // Уникальная коллекция
println(analyze(uniqueList)) // Ожидается: "Уникальная"
}

// Метод для анализа состояния числовой коллекции
fun analyze(list: List<Int>): String {
    return when {
        list.isEmpty() -> "Пусто"
        list.size < 5 -> "Короткая"
        list.firstOrNull() == 0 -> "Стартовая"
        list.sum() > 10000 -> "Массивная"
        list.average() == 10.0 -> "Сбалансированная"
        list.joinToString("").length == 20 -> "Клейкая"
        list.maxOrNull() ?: Int.MIN_VALUE < -10 -> "Отрицательная"
        list.minOrNull() ?: Int.MAX_VALUE > 1000 -> "Положительная"
        list.contains(3) && list.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }

    // Задание 3: Анализ Учебных Оценок
    // Начальные значения оценок
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)

    // Вызов метода для анализа учебных оценок и вывод результата
    val topGrades = analyzeGrades(grades)
    println(topGrades)
}

// Метод для анализа учебных оценок
fun analyzeGrades(grades: List<Int>): List<Int> {
    // Фильтрация оценок, сортировка и получение первых трех
    return grades.filter { it >= 60 } // Отбираем удовлетворительные оценки (>=60)
        .sorted() // Сортируем по возрастанию
        .take(3) // Берем первые 3 оценки


    // Задание 4: Создание каталога по первой букве
    // Начальные значения списка предметов
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра",
        "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка",
        "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка",
        "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка",
        "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы",
        "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда",
        "Настольная лампа", "торшер", "Этажерка"
    )

    // Вызов метода для группировки слов и вывод результата
    val groupedCatalog = createCatalog(list)
    println(groupedCatalog)
}

// Метод для приведения слов к нижнему регистру и группировки по первой букве
fun createCatalog(items: List<String>): Map<Char, List<String>> {
    return items.map { it.lowercase() } // Приводим все слова к нижнему регистру
        .groupBy { it.first() } // Группируем по первой букве


    //задание 5
    // Начальные значения из задачи 3
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)

    // Вызов метода для подсчета средней длины слов и вывод результата
    val averageLength = calculateAverageWordLength(grades)
    println("Средняя длина слов: %.2f".format(averageLength))
}

// Метод для подсчета средней длины слов в списке
fun calculateAverageWordLength(words: List<Int>): Double {
    // Преобразуем числа в длины строк через map, затем используем метод average для вычисления среднего
    return words.map { it.toString().length } // Преобразуем каждое число в длину его строкового представления
        .average() // Вычисляем среднее значение длины

}

//задание 6
// Начальные значения
val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

// Вызов метода для категоризации чисел и вывод результата
val categorizedNumbers = categorizeNumbers(numbers)
println(categorizedNumbers)
}

// Метод для категоризации чисел
fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> {
    // Используем distinct для отбора уникальных чисел, сортируем по убыванию и группируем по четности
    return numbers.distinct() // Отбираем уникальные числа
        .sortedDescending() // Сортируем по убыванию
        .groupBy { if (it % 2 == 0) "четные" else "нечетные" } // Группируем по четности
}