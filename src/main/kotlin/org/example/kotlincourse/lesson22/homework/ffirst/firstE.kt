package org.example.kotlincourse.lesson22.homework.ffirst

fun Long?.toFormattedString(): String {
    return this?.let {"Long Value is: $it"} ?:"Value is null"
}