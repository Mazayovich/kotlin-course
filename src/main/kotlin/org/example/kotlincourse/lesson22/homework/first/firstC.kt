package org.example.kotlincourse.lesson22.homework.first

fun <T> MutableList<T>.addAndGetLast(element: T?, index: Int): T? {
    if (index in 0.this.size) {
        this.add(index, element)
    }
    return this.lastOrNull()
}
