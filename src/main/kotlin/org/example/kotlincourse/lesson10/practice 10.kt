package org.example.kotlincourse.lesson10

//задание:
//создать пустой массив целых чисел длиной 10 элементов, заполненного нулями
fun main() {
    val array = Array(100) { 0 }
    val arrayDouble = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)


    // задание 2
    // создай массив из 10 элементов типа инт и используй цикл фор для заполения
   // массива числами от 10 до 100  с шагом 10

    val array1 = Array(10) { 0 }
    array1[0] = 10
    for (i in array1.indices) {
        array1[i] = (i + 1) * 10
    }
println(array1.toList())
    val array2 = arrayOf("a", "b", "c", "d", "e")
    for (i in array2.indices) {
        array2[i] = " "
    }
    println(array2.toList())



    //задание: срздать 2 массива интов, добавить 3 целочисленных значения


val array3 = arrayOf(2, 3, 4)
val array4 = arrayOf(5, 6, 7)
val  emptyArray1 = Array(3){0}
    for (i in emptyArray1.indices){
        emptyArray1[i] = array3[i] + array4[i]
    }

//задание: создать пустой неизменяемый список целых чисел

    val list1 = listOf<Int>()


    // задание: создать неизменяемый список строк, содержащий 3 элемента с любыми  значениями
    val list2 = listOf("a", "b", "c")

//задание: пустой изменяемый список с элементами типов лот
     val mutableList1 = mutableListOf<Float> ()
// задание: в созданный список добавить пару значений (предыдущий список)
    //тк он уже содан, мы к нему просто обращаемся
    mutableList1.add(45F)
    mutableList1.add(38F)
    mutableList1.remove(45F)

    //удаляем элемент по индексу
    mutableList1.removeAt(0)




    println(mutableList1)

//задание: создать пустое неизменное множество целых чисел
    val emptySet = setOf<Int>()

//задание: создать set множество неизменяемых и проинциализировать сразу пятью числами разными
    val setNum = setOf(1, 2, 3, 4, 5)

//теперь создать изменяемое множество и проинциализировать тремя числами.

    val setNum2 = mutableSetOf(1, 2, 3)

    //теперь в изменяемое множество добавить еще одно число.

setNum2.add(6)
    //какое-нибкдль число удалим

    setNum2.remove(2)







}