package org.example.kotlincourse.lesson22.homework.ffirst

fun Array<Int>.toMinMaxPair(): Pair<Int, Int>? {
    if(this.isEmpty()) return null
    return Pair(this.minOrNull() ?: 0, this.maxOrNull() ?:0)
}