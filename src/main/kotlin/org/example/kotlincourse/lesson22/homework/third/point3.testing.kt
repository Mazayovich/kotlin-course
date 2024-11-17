package org.example.kotlincourse.lesson22.homework.third

fun main(){
    //простая пара
    val pair1 = Pair(1, "Привет")
    val revertedPair1 = pair1.revert()
    println("Original: $pair1, Reverted: $revertedPair1")

    //пара с налл

    val pair2 = Pair(null, 55)
    val revertedPair2 = pair2.revert()
    println("Original: $pair2, Perverted: $revertedPair2")

    //пара из одинаковых типов

    val pair3 = Pair(5, 10)
    val revertedPair3 = pair3.revert()
    println("Original: $pair3, Reverted: $revertedPair3")

    //пара с вложенными парами

    val pair4: Pair<Int, String> = Pair(1, "G"); Pair(4, "L")
    val revertedPair4 = pair4.revert()
    println("Original: $pair4, Reverted: $revertedPair4")









}