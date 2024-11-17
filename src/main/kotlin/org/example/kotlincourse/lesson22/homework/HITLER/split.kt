package org.example.kotlincourse.lesson22.homework.HITLER

import org.example.kotlincourse.lesson4.letter

fun String.splitByLettersWithAuthors(authors: List<String>) {
    val letters = this.toList() //разбила строчку на символы
    val authorsCycle = generateSequence { authors }.flatten().iterator()
    letters.forEach{
        letter ->
        val author = authorsCycle.next()
        println("$author\n$letter\n")
    }
}

fun main () {
    val authors = listOf(
        "Ксюша Мазаёвич",
        "Саша Молокович",
        "Юля Толтаева",
        "Юлиана",
        "Лев Шевцов",
        "Сергей Северин"
    )
    val text = "ГИТЛЕР"
    text.splitByLettersWithAuthors(authors)

}