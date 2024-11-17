package org.example.kotlincourse.lesson22.homework.fifth

fun main(){
    //исходная строка
    val originalString = "Привет, я Ксюша"
val encrypted = originalString.encrypt(3)
    println("Encrypted: $encrypted") // тут шифрование

    //расшифровка

    val decrypted = encrypted.dectypt(3)
    println("Decrypted: $decrypted") //вовращается оригинальная строчка

    // проверка, что реально вернется к исходному виду
    println("Decryption successful: ${originalString == decrypted}") //если тру- все ок



}