package org.example.kotlincourse.lesson22.homework.fourth

fun main(){
    //интовые
    println(10.within(12, 3)) //будет тру, тк 12-10 = 2, 2 меньше 3
    println(10.within(15, 3)) // false, тк 15-10 =5, 5 больше 3



    //дабловые
    println(10.5.within(10.0, 0.6)) // тру, тк 10,5-10 =0,5,  0,5< 0.6
    println(10.5.within(9.0, 1.4))
// false  тк 10.5 - 9.0 = 1,5 а 1,5 больше 1,4


    //флоат
    val floatNumber: Float = 7.2F
    println(floatNumber.within(7.5F, 0.4F)) //true: 7.2-7.5=0.3, a 0.3<0.4
    println(floatNumber.within(8.0F, 0.4F)) //false: 7.2-8.0=0.8, a 0.8>0,4


}