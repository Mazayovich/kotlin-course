fun main() {

    println("task1:")
    task1()


    println("task2:")
    task2()

    println("task3:")
    task3()

    println("task4:")
    task4()

    println("task5:")
    task5()

    println("task6:")
    task6()


}

// задание в начале (тут у меня будет номер) 1
//Правила Проверки и Преобразования:
fun task1() {
    println(convert("Это невозможно выполнить за один день"))
    println(convert("Я не уверен в успехе этого проекта"))
    println(convert("Произошла катастрофа на сервере"))
    println(convert("Этот код работает без проблем"))
    println(convert("Удача"))
}

fun convert(string: String): String {
    return when {
        string.contains("невозможно", ignoreCase = true) ->
            string.replace("невозможно", "совершенно точно возможно, просто требует времени", ignoreCase = true)
        string.startsWith("Я не уверен", ignoreCase = true) ->
            "$string, но моя интуиция говорит об обратном"
        string.contains("катастрофа", ignoreCase = true) ->
            string.replace("катастрофа", "интересное событие", ignoreCase = true)
        string.endsWith("без проблем", ignoreCase = true) ->
            string.replace("без проблем", "с парой интересных вызовов на пути", ignoreCase = true)
        string.trim().indexOf(" ") == -1 ->
            "Иногда, $string, но не всегда"
        else -> string
    }
}

//задача 2 ( в дз 1)
//Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
fun task2() {
    val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"

    val indexOfArrow = log.indexOf("->") + 2
    val dateTime = log.substring(indexOfArrow).trim()

    val date = dateTime.substring(0, 10)
    val time = dateTime.substring(11)

    println(date)
    println(time)
}

// задача 3 Маскирование Личных Данных
fun task3() {
    val creditCardNumber = "4539 1488 0343 6467"

    // Оставляем последние 4 цифры
    val lastFourDigits = creditCardNumber.substring(creditCardNumber.length - 4)
    val maskedPart = "**** **** **** "
    val maskedCardNumber = maskedPart + lastFourDigits

    println(maskedCardNumber)
}

//задача 4 Форматирование Адреса Электронной Почты. Используй replace
fun task4() {

        val email = "username@example.com"
        val formattedEmail = email.replace("@", " [at] ").replace(".", " [dot] ")
        println(formattedEmail)
    }


//задача 5 Извлечение Имени Файла из Пути
fun task5() {
    val filePath = "C:/Пользователи/Документы/report.txt"
    val lastSlashIndex = filePath.lastIndexOf('/')
    val fileName = filePath.substring(lastSlashIndex + 1)

    println(fileName)
}

//задача 6 Создание Аббревиатуры из Фразы.
// Используй split с набором символов для разделения.
// Используй for для перебора слов.
// Используй var переменную для накопления первых букв.
fun task6() {

    val phrase = "Объектно-ориентированное программирование"
    val words = phrase.split(" ", "-", "–")
    var abbreviation = ""
    for (word in words) {
        if (word.isNotEmpty()) {
            abbreviation += word[0] // Добавила первую букву слова
        }
    }
    println(abbreviation)
}

