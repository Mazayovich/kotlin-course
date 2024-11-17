package org.example.kotlincourse.lesson22.homework.first

fun Long?.toFormattedString(): String {
    return this?.let {"Long Value is: $it"} ?:"Value is null"
}