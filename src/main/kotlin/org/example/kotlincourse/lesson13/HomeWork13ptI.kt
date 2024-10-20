
package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson13

fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6)
    val list2 = listOf("A", "B", "C", "D", "E")

//1. Предварительные задачи на использование методов.
//Подбери подходящий для задачи метод
//Задачи на приведение коллекций к значению
//isNotEmpty
//getOrElse
//joinToString
//firstOrNull
//size
//isEmpty
//minOrNull
//contains
//sum
//average
//maxOrNull

//Проверить, что размер коллекции больше 5 элементов.
    val check1 = list.size

//Проверить, что коллекция пустая
    if (list.isEmpty()) {
        val check2 = true
    }

//Проверить, что коллекция не пустая
    if (list.isNotEmpty()) {
        val check3 = true
    }

//Взять элемент по индексу или создать значение если индекса не существует
    val check4 = list.getOrElse(1) { 5 }

//Собрать коллекцию в строку
    val check5 = list.joinToString(", ")

//Посчитать сумму всех значений
    val check6 = list.sum()

//Посчитать среднее
    val check7 = list.average()

//Взять максимальное число
    val check8 = list.maxOrNull()

//Взять минимальное число
    val check9 = list.minOrNull()

//Взять первое число или null
    val check10 = list.firstOrNull()

//Проверить что коллекция содержит элемент
    val check11 = list.contains(5)

//Задачи на обработку коллекций
//sorted+
//groupBy+
//distinct+
//take+
//takeLast+
//filter+
//filterNot+
//map
//associate+
//sortedDescending+
//forEach+
//filterNotNull+

//Отфильтровать коллекцию по диапазону 18-30
    val collect1 = list.filter { it in 18..30 }

//Выбрать числа, которые не делятся на 2 и 3 одновременно
    val collect2 = list.filterNot { (it % 2 == 0) && (it % 3 == 0) }

//Очистить текстовую коллекцию от null элементов
    val collect3 = list2.filterNotNull()

//Преобразовать текстовую коллекцию в коллекцию длин слов
    val collect4 = list2.map { it.length }

//Преобразовать текстовую коллекцию в мапу, где ключи - слова,
//а значения - перевёрнутые слова
    val collect5 = list.associate { it to it }

//Отсортировать список в алфавитном порядке
    val collect6 = list2.sorted()

//Отсортировать список по убыванию
    val collect7 = list2.sortedDescending()

//Распечатать квадраты элементов списка
    val collect8 = list.forEach { println(it * it) }

//Группировать список по первой букве слов
    val collect9 = list2.groupBy { it.substring(0) }

//Очистить список от дублей
    val collect10 = list2.distinct()

//Взять первые 3 элемента списка
    val collect11 = list2.take(3)

//Взять последние 3 элемента списка
    val collect12 = list2.takeLast(3)

    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)

    val list4 = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра",
        "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка",
        "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка",
        "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка",
        "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы",
        "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда",
        "Настольная лампа", "торшер", "Этажерка"
    )

    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

    val ages = listOf(22, 18, 30, 45, 17, null, 60)

    println("\nTask 2")
    println(charOfNumCollect(listOf()))
    println(charOfNumCollect(listOf(1, 2, 3, 4)))
    println(charOfNumCollect(listOf(0, 1, 2, 3, 4)))
    println(charOfNumCollect(listOf(1000, 2000, 3000, 4000, 1, 0)))
    println(charOfNumCollect(listOf(100, 150, 100, 500, 100, 0, 0, 0, 0, 0)))
    println(charOfNumCollect(listOf(10, 15, 10, 5, 10)))
    println(charOfNumCollect(listOf(-11, -20, -30, -40, -50)))
    println(charOfNumCollect(listOf(1001, 1002, 1003, 1004, 1005)))
    println(charOfNumCollect(listOf(1, 0, 3, 14, 0)))
    println(charOfNumCollect(listOf(1, 0, 3, 0, 0)))

    println("\nTask 3")
    println(analysisOfEduAsses(grades))

    println("\nTask 4")
    println(createCatalogByFirstLetter(list4))

    val result5 = calcAverageLengthOfWords(list4).toFloat()

    println("\nTask 5")
    println("%.2f".format(result5))

    println("\nTask 6")
    println(numCategorization(numbers))

    println("\nTask 7")
    println(getFirstElement(ages))
}

//Задание 2: Характеристика числовой коллекции
//Написать метод, который принимает коллекцию чисел и возвращает строку
//с текущим состоянием коллекции используя конструкцию when
//Если коллекция пустая - “Пусто”
//Если количество элементов меньше пяти - “Короткая”
//Если коллекция начинается с 0 - “Стартовая”
//Если сумма всех чисел больше 10000 - “Массивная”
//Если среднее значение равно 10 - “Сбалансированная”
//Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
//Если максимальное число меньше -10 - “Отрицательная”
//Если минимальное число больше 1000 - “Положительная”
//Если содержит одновременно числа 3 и 14 - “Пи***тая”
//Иначе - “Уникальная”
//Вызвать метод с данными, подходящими под каждую из веток

fun charOfNumCollect(listNum2: List<Int>): String {
    return when {
        listNum2.isEmpty() -> "Пусто"
        listNum2.size < 5 -> "Короткая"
        listNum2[0] == 0 -> "Стартовая"
        listNum2.sum() > 10000 -> "Массивная"
        listNum2.average() == 10.0 -> "Сбалансированная"
        listNum2.joinToString("").length == 20 -> "Клейкая"
        listNum2.max() < -10 -> "Отрицательная"
        listNum2.min() > 1000 -> "Положительная"
        listNum2.contains(3) && listNum2.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}

//Задание 3: Анализ Учебных Оценок
//Начальные значения: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
//Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию
//и взять первые 3.

fun analysisOfEduAsses(grades: List<Int>): List<Int> {
    return grades.filter { it >= 60 }
        .sorted()
        .take(3)
}

//Задание 4: Создание каталога по первой букве.
//Начальные значения: val list = listOf(
//    "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра",
//    "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка",
//    "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка",
//    "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка",
//    "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы",
//    "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда",
//    "Настольная лампа", "торшер", "Этажерка"
//)
//Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве.

fun createCatalogByFirstLetter(list4: List<String>): Map<String, List<String>> {
    val list4Filter = list4.map {
        it.lowercase()
    }
    val list4Group = list4Filter.groupBy { it.substring(0, 1) }
    return list4Group
}

//Задание 5: Подсчёт средней длины слов в списке.
////Начальные значения из задачи 3.
////Цель: Перевести все слова в количество букв, подсчитать среднее значение.
////Вывести форматированный текст с двумя знаками после запятой.

fun calcAverageLengthOfWords(list4: List<String>): Float {
    val lengthElem = list4.map { it.length }
    val lengthAverage = lengthElem.average().toFloat()
    return lengthAverage
}

//Задание 6: Категоризация чисел.
//Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
//Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности
//(“четные” и “нечетные”).

fun numCategorization(numbers: List<Int>): String {
    val numbersFilter = numbers.distinct()
        .sortedDescending()
    val numbersFinal = numbersFilter.groupBy {
        if (it % 2 == 0) "четные"
        else "нечетные"
    }.toString()
    return numbersFinal
}

//Задание 7: Поиск первого подходящего элемента
//Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60)
//Цель: Найти первый возраст в списке, который соответствует условию (больше 18),
//преобразовать его к строке, или вернуть сообщение "Подходящий возраст не найден".

fun getFirstElement(ages: List<Int?>): String {
    val elem = ages.filterNotNull()
        .firstOrNull { it > 18 }
    return elem?.toString() ?: "Подходящий возраст не найден"
}
