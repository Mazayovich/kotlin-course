package org.example.kotlincourse.lesson15.homework

fun main(){

    //задача про вечеринку

val happyBday = Party("Tbilisi Hills", 130)
    happyBday.details()

    // эмоция

val yourEmotion = Emotion("Радость", 100)
    yourEmotion.express()

    //луна

    Moon.showPhase()

// product

    val milk = Product("NeMoloko", 25.56, 3)
    println(milk)


//concert
    val concert = Concert("Вкатись в IT", "Олимпийский", 245.74, 600)
    concert.details()
    concert.buyTicket()

}