package org.example.kotlincourse.lesson6

import kotlin.time.TimeMark

fun main () {
}
fun checkPassword (password : String) : Boolean {
    if (password.length <= 8) return false
    if (checkSymbols(password)) return true
    else return false
}

fun checkSymbols (password : String) : Boolean {
    return false
}



// задача про оценки в школе
fun convertMark (mark: Int): String {

    val result = when (mark){
        in 0..20 -> "F"
        in 21..40 -> "E"
        in 41..60 -> "D"
        in 61..80 -> "C"
        in 81..90 -> "B"
        in 91..100 -> "A"
        else -> "invalid mark"
    }
return result
}
