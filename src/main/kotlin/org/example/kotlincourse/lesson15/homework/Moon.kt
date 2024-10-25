package org.example.kotlincourse.lesson15.homework

object Moon {
var isVisible: Boolean = false
    var phase: String = "New Moon"
    fun showPhase(){
        println("Привет! Сегодняшняя фаза луны - $phase! Доброй ночи")
    }


}