package org.example.kotlincourse.lesson22.homework.fifth

fun String.encrypt(base: Int): String {
    return this.map { (it + base).toChar() }.joinToString("");

}
fun String.dectypt(base: Int): String {
    return this.map { (it - base).toChar() }.joinToString("")
}