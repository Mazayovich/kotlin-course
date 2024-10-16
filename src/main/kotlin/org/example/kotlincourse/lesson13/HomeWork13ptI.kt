package org.example.kotlincourse.lesson13


fun main() {

    // ЗАДАНИЕ 1 Подбери подходящий для задачи метод

    val numbers = listOf(3, 7, 12, 19, 24, 31, 42, 56)

    // размер коллекции больше 5 элементов
    val isSizeGreaterThanFive = numbers.size > 5
    println(isSizeGreaterThanFive) // true, если элементов больше 5

    // коллекция пустая
    val isCollectionEmpty = numbers.isEmpty()
    println(isCollectionEmpty) // true, если коллекция пустая

    // коллекция не пустая
    val isCollectionNotEmpty = numbers.isNotEmpty()
    println(isCollectionNotEmpty) // true, если коллекция не пустая

    // Взять элемент по индексу или вернуть значение по умолчанию
    val elementOrElse = numbers.getOrElse(10) { -1 }
    println(elementOrElse) // возвращает элемент по индексу или -1, если индекс отсутствует

    // Сбор коллекции в строку
    val collectionAsString = numbers.joinToString(separator = ", ")
    println(collectionAsString) // вывод коллекции в виде строки

    // Подсчет суммы всех значений
    val sumOfElements = numbers.sum()
    println(sumOfElements) // сумма всех элементов

    // Подсчет среднего значения
    val averageValue = numbers.average()
    println(averageValue) // среднее арифметическое элементов

    // Взятие максимального значения
    val maxElement = numbers.maxOrNull()
    println(maxElement) // максимальный элемент коллекции

    // Взятие минимального значения
    val minElement = numbers.minOrNull()
    println(minElement) // минимальный элемент коллекции

    // Взятие первого элемента или null
    val firstElementOrNull = numbers.firstOrNull()
    println(firstElementOrNull) // первый элемент коллекции или null, если пусто

    // Проверяем, содержит ли коллекция определенный элемент
    val containsElement = numbers.contains(24)
    println(containsElement) // true, если коллекция содержит 24

    //

//ЗАДАНИЕ 2. Задачи на обработку коллекций

    val numbers = listOf(10, 18, 25, 30, 41, 55, 18, 30)
    val words = listOf("apple", null, "banana", "cherry", null, "date", "apple")

    // Отфильтровать коллекцию чисел по диапазону 18-30
    val filteredRange = numbers.filter { it in 18..30 }
    println(filteredRange) // список чисел в диапазоне от 18 до 30

    // Выбрать числа, которые не делятся на 2 и 3 одновременно
    val notDivisibleBy2And3 = numbers.filterNot { it % 2 == 0 && it % 3 == 0 }
    println(notDivisibleBy2And3) // числа, не делящиеся одновременно на 2 и 3

    // Очистить текстовую коллекцию от null элементов
    val nonNullWords = words.filterNotNull()
    println(nonNullWords) // список слов без null

    // Преобразовать текстовую коллекцию в коллекцию длин слов
    val wordLengths = nonNullWords.map { it.length }
    println(wordLengths) // длины каждого слова

    // Преобразовать текстовую коллекцию в мапу: ключи - слова, значения - перевёрнутые слова
    val reversedWordsMap = nonNullWords.associate { it to it.reversed() }
    println(reversedWordsMap) // мапа слов и их перевёрнутых вариантов

    // Отсортировать список в алфавитном порядке
    val sortedWords = nonNullWords.sorted()
    println(sortedWords) // слова в алфавитном порядке

    // Отсортировать список чисел по убыванию
    val sortedDescendingNumbers = numbers.sortedDescending()
    println(sortedDescendingNumbers) // числа в порядке убывания

    // Распечатать квадраты элементов списка чисел
    numbers.forEach { println(it * it) } // квадраты каждого числа

    // Группировать список слов по первой букве
    val groupedByFirstLetter = nonNullWords.groupBy { it.first() }
    println(groupedByFirstLetter) // слова, сгруппированные по первой букве

    // Очистить список чисел от дублей
    val distinctNumbers = numbers.distinct()
    println(distinctNumbers) // уникальные числа

    // Взять первые 3 элемента списка чисел
    val firstThree = numbers.take(3)
    println(firstThree) // первые три элемента

    // Взять последние 3 элемента списка чисел
    val lastThree = numbers.takeLast(3)
    println(lastThree) // последние три элемента



}
