package org.example.kotlincourse.lesson6

import java.time.Month

//Задание 1: "Определение Сезона"
//Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.
fun main () {
}
fun determineSeason(month: Int): String {
    if (month !in 1..12) {
        return "Неверный месяц"
    }
    return when (month) {
        in 12..2 -> "Зима"
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        else -> "Неверный месяц"
    }
}

//Задание 2: "Расчет Возраста Питомца"
//преобразовать возраст собаки в "человеческие" годы.

fun calculateDogAge(dogYears: Int): String {
    if (dogYears < 0) {
        return "Алярм! Пёсий возраст не может быть отрицательным"
    }
    val humanYears = if (dogYears <= 2) {
        dogYears * 10.5
    } else {
        2 * 10.5 + (dogYears - 2) * 4
    }
    return "Возраст собаки в человеческих годах: $humanYears"
}

//Задание 3: Определение Вида Транспорта
//какой вид транспорта лучше использовать, исходя из длины маршрута.

fun determineTransport(distance: Double): String {
    // Проверяем расстояние и возвращаем соответствующий вид транспорта
    return when {
        distance <= 1 -> "пешком" // Если маршрут до 1 км
        distance <= 5 -> "велосипед" // Если маршрут от 1 до 5 км
        else -> "автотранспорт" // Если маршрут больше 5 км
    }
}
//Задание 4: Расчет Бонусных Баллов
//
fun calculateBonus(purchaseAmount: Double): Int {
    // Если сумма покупки до 1000 рублей, начисляем 2 балла за каждые 100
    return if (purchaseAmount <= 1000) {
        (purchaseAmount / 100 * 2).toInt()
    } else {
        // Если сумма покупки выше 1000, начисляем 5 баллов за каждые 100
        (purchaseAmount / 100 * 5).toInt()
    }
}

// Задание 5: Определение Типа Документа
fun determineDocumentType(extension: String): String {
    // В зависимости от расширения файла возвращаем его тип
    return when (extension) {
        "txt", "doc", "docx" -> "Текстовый документ" // Для текстовых файлов
        "jpg", "png", "gif" -> "Изображение" // Для изображений
        "xls", "xlsx" -> "Таблица" // Для таблиц
        else -> "Неизвестный тип" // Для остальных расширений
    }
}

//Задание 6: Конвертация Температуры
//
fun convertTemperature(value: Double, unit: String): String {
    // Проверяем, в каких единицах измерения передана температура
    return if (unit.uppercase() == "C") {
        // Если цельсий, конвертируем в фаренгейты
        val fahrenheit = value * 9 / 5 + 32
        "$fahrenheit F" // Возвращаем результат в формате "значение F"
    } else {
        // Если фаренгейт, конвертируем в цельсии
        val celsius = (value - 32) * 5 / 9
        "$celsius C" // Возвращаем результат в формате "значение C"
    }
}

//Задание 7
fun recommendClothing(temperature: Double): String {
    // В зависимости от температуры возвращаем рекомендации по одежде
    return when {
        temperature < -30 || temperature > 35 -> "не выходить из дома" // Крайние температуры
        temperature < 0 -> "куртка и шапка" // Холодно
        temperature <= 15 -> "ветровка" // Прохладно
        else -> "футболка и шорты" // Тепло
    }
}

//Задание 8
fun chooseMovieCategory(age: Int): String {
    // В зависимости от возраста возвращаем категории фильмов
    return when {
        age < 12 -> "детские" // Для детей
        age in 12..17 -> "подростковые" // Для подростков
        else -> "18+" // Для взрослых
    }
}
