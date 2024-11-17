package org.example.kotlincourse.lesson22.homework.first

fun main(){
    //1
    val numbers = arrayOf(10, 20, 30, 40, 50)
    println(numbers.toMinMaxPair())

    //2
    val char: Char? = 'X'
    char.printDetails(5, 10, true)

    val nullChar: Char? = null
    nullChar.printDetails(7, 8, false)

//3
    val list = mutableListOf(1, 2, 3)
    println(list.addAndGetLast(4, 1))
    println(list)


//4 не могу

    //5
    val longValue: Long = 1234567890L
    println(longValue.toFormattedString())

    val nullLong: Long? = null
    println(nullLong.toFormattedString()) //тут выведется волью и налл




}