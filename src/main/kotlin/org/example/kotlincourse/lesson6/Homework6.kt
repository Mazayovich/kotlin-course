@file:Suppress("UNREACHABLE_CODE")

package org.example.kotlincourse.lesson6

import java.time.Month

//Задание 1: "Определение Сезона"
//Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.
fun main () {
    println(seasonOfTheYear(month))
}
val month = 12
fun seasonOfTheYear (month: Int): String {

        return when (month) {
            !in 1..12 -> "Неверно указан месяц"
            in 3..5 -> "Весна"
            in 6..8 -> "Лето"
            in 9..11 -> "Осень"
            else -> "Зима"
        }

//Задание 2: "Расчет Возраста Питомца"
//преобразовать возраст собаки в "человеческие" годы.

val pupAge = 20.0
fun pupAgeIntoHumanAge (pupAge: Double): Double {
    return if (pupAge <= 0.0) throw Exception("")
    else if (pupAge <= 2.0) pupAge * 10.5
    else (pupAge - 2) * 4 + 21

    }
}

//Задание 3: Определение Вида Транспорта
//какой вид транспорта лучше использовать, исходя из длины маршрута.
val distance = 3.0
fun getVehicleType(distance: Double): String {
    // Проверяем расстояние и возвращаем соответствующий вид транспорта
    return when {
    distance <= 0.0 -> "Не выходи из дома не совершай ошибку"
    distance <= 1.0 -> "пешком" // Если маршрут до 1 км
    distance <= 5.0 -> "велосипед" // Если маршрут от 1 до 5 км
        else -> "автотранспорт" // Если маршрут больше 5 км
    }
}
//Задание 4: Расчет Бонусных Баллов
//
val price = 11
fun calculateBonusPoints(price: Int): Int {
    // Если сумма покупки до 1000 рублей, начисляем 2 балла за каждые 100
    if (price < 0) throw Exception("")
    val dif = price / 100
    val coef = if (price < 1000) 2 else 5
    return dif * coef
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
fun temperatureConversion(temperatureforConv: Int, measureSystem: String): String {
    // Проверяем, в каких единицах измерения передана температура
    var totalResult: String
    if (measureSystem == "C")
    {
        totalResult = "${temperatureforConv * 1.8 + 32} F"
    }   else if (measureSystem == "F")
    {
        totalResult = "${temperatureforConv - 32 / 1.8} C"
    } else
    {totalResult = "Error"}
    return totalResult
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
// ВТОРОЙ ВАРИАНТ РЕШЕНИЯ ЗАДАЧИ ОТ САШИ
fun whichCloses(temperature: Int): String {

    return when(temperature) {
        in -30 until 0 -> "куртка и шапка"
        in 0..15 -> "ветровка"
        in 16..35 ->  "футболка и шорты"
        else -> "не выходить из дома"
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
