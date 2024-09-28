package org.example.kotlincourse.lesson8

fun main () {
    val simpleString = "Это простая строка"
    val firstName = "Ксюша"
    val lastName = "Мазаёвич"
    val fullName = "$firstName $lastName" //все, что внутри "", попадет в строку
    println(fullName)

    val age = 30
    val greeting = "Шалом! Меня зовут $firstName, и мне $age лет"
    println(greeting)


val person = Person(name = "Ксюшка", age = 30)
 val introduction = "Меня зовут ${person.name}, и мне ${person.age} лет!"
println (introduction)

    val details = "Здесь находятся ${getDetails()}"
println(details)

val x = 10
val y = 20
    val resultString = "Реультат сложения x и y равен ${x + y}"
println(resultString)
// это были шаблоны
}

    class Person(val name: String, val age: Int)

fun  getDetails(): String {
return "очень интересные детали"

}


