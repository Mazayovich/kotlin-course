package org.example.kotlincourse.lesson10

//    КОЛЛЕКЦИИ
//МАССИВЫ
fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val numbers1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val doubles = doubleArrayOf(1.1, 2.2, 3.3)


    val emptyArray = Array(5) { "" }
    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5)

    // массивы всегда именяемые, а списки могут быть и изм, и неизм!!

    val readOnlyList: List<String> = listOf("a", "b", "c") // этот метод создает список неизменяемый

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c") //у этого класса есть методы,
                                                                       // и создает список изменяемый


    //array - постоянной длины, изменяемый
    //list - постоянной длины, неизменяемый
    //mutableList - переменной длины, изменяемый


    //*** множество. специальный тип коллекции ***

    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5) //изменяемое множ-во. сет(мн-во)
                                                   // состоит из уник-х значений

    val set = setOf("K", "o", "t", "l", "i", "n")
    for (letter in set) {
        println("| $letter |")
    }

    ////// следующий пример:

    val list = listOf(32, 53,1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }


    //следующий пример
    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`")
    }

}