@file:Suppress("UNREACHABLE_CODE")

package org.example.kotlincourse.lesson8

fun main () {
val text1 = "Kotlin: The Fun Way to Learn Programming"
println(text1.substring(8, 19))

val text2 = "contact@example.com"
 val indexOfAt = text2.indexOf(string = "@")
println(text2.substring(indexOfAt + 1))

val numb = "123-456-7890"
val subString = numb.substring(8)
    println("XXX-XXX-$subString")



}