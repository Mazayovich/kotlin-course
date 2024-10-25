package org.example.kotlincourse.lesson15.homework

class Party(val location: String, var attendees: Int) {
fun details(){
println("Привет! Вечеринка пройдет тут: $location, на данный момент количество принявших приглашение гостей: $attendees! До встречи!")
}
}