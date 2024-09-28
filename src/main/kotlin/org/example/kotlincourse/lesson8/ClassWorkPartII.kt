package org.example.kotlincourse.lesson8

fun main () {

    val originalString = "Kotlin is fun"
    val subString =
        originalString.substring(startIndex = 7)// 7ой знак - это i, она часть слова, входящего в нужную часть, поэтому она входит
    val subString2 =
        originalString.substring(3, 6)//, бука Л первая (3), индекс 6 - это неключительно (до него как последний символ)
    val replaceString = originalString.replace(oldValue = "fun", newValue = "awesome")//замена
    val replaceString2 = originalString.replace(oldValue = "n", newValue = "J")//замена
    val length = "Hello".length
    val upper = "hello".uppercase() //большие буквы из маленьких
    val lower = "HELLO".lowercase()// все буквы маленькие
    val trimmed = "  hello  ".trim()//обрезает пробелы по краям
    val starts = "Kotlin".startsWith("Kot")// проверяет начинается ли строка с опредлен префикса
    val ends = "Kotlin".endsWith("lin") // проверяет заканчивается ли строка опредлен суффиксом
    val contains = "Hello".contains("ell")// на вхождение от строки в строку (входит ли)
    val empty = "".isNullOrEmpty()//проверка строки на то, что строка налл или не содержит в себе данных
    val blank = "  ".isNullOrBlank()// проверка что обьект налл или бланк пустой
    val repeat = "ab".repeat(3)//повторяет строку сколько-то раз, сколько указали
    val letter = originalString[5]// метод гет (взять) по индексу, указанному здесь(ориджинал стринг - это из фан)
    val indexOfChar = "Kotlin".indexOf('t')// вернет индекс первого вхождения символа в строку (какой по счету символ)
    val indexOfWord = "Kotlin is the best language".indexOf("best")//вхождение по строке
    val backReverse = "niltoK".reversed()// перевернет слово в обратную сторону
    val multiLineString = """
    Первая строка
    Вторая строка
    Третья строка
""".trimIndent()// включая знаки переноса так будет храниться в памяти. нужна для очищения каждой строки от пробелов слева


}