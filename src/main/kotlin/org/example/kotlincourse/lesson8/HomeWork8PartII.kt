package org.example.kotlincourse.lesson8

//Дополнительные задания
//Написать метод, который преобразует строку из нескольких слов в строку

fun main() {
    println("task1:")
    task1()


    println("task2:")
    task2()

    println("task3:")
    task3()
}

fun task1() {
val inputString = "программирование на языке kotlin"
    val words = inputString.split(" ")
    var capitalizedWords = ""
    for (word in words) {
        if (word.isNotEmpty()) {
            val capitalizedWord = word[0].uppercase() + word.substring(1).lowercase()
            capitalizedWords += "$capitalizedWord " // Добавляем слово с пробелом
        }
    }


    capitalizedWords = capitalizedWords.trim()
    println(capitalizedWords)

}
fun task2() {
//    val originalString = "Kotlin"
//    val encryptedString = encrypt(originalString)
//    println("Зашифрованная строка: $encryptedString")
//
//    val decryptedString = decrypt(encryptedString)
//    println("Расшифрованная строка: $decryptedString")
//    fun encrypt(input: String): String {
//
//        val modifiedInput = if (input.length % 2 == 1) input + " " else input
//        var encrypted = ""
//        for (i in modifiedInput.indices step 2) {
//            if (i + 1 < modifiedInput.length) {
//                encrypted += modifiedInput[i + 1] // следующая буква
//                encrypted += modifiedInput[i] // текущая буква
//            }
//        }
//
//        return encrypted
//    }
//
//    fun decrypt(input: String): String {
//        // Переменная для хранения расшифрованной строки
//        var decrypted = ""
//
//        // Перебираем строку с шагом 2
//        for (i in input.indices step 2) {
//            // Если следующий символ существует, меняем их местами
//            if (i + 1 < input.length) {
//                decrypted += input[i + 1] // следующая буква
//                decrypted += input[i] // текущая буква
//            }
//        }
//
//        // Убираем пробел в конце, если он есть
//        return decrypted.trimEnd()
//    }
//}

}


fun task3() {


}
