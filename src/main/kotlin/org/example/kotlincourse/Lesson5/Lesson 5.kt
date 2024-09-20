package org.example.kotlincourse.Lesson5

fun main() {
    val sum = 10 + 5
    val diff = 10 - 5
    val product = 10 * 5
    val quotinent = 10 / 5
    val remainder = 10 % 5
    val remainder1 = 10 % 6
    val remainder2 = 10 % 4

    //операторы сравнения:

    val isEqual = (5 == 5)
    val isNotEqual = (5 != 5)
    val isGreater = (5 > 3)
    val isGreaterOrEqual = (5 >= 5)
    val isLessOrEqual = (5 <= 5)

    //логические операторы

    val andResult = (5 > 3) && (5 > 4)
    //разбор того, что на строке 23:
    //val andResult = true && true //следовательно правда И правда

    val orResult = true || false
    val notResult = !(5 > 3)


    // операторы присваивания
    val number = 5
    //number = number + 3 // эту запись можно написать так: number += // 3

    println(notResult)




    // practice

//val a = (3 + 2 < 6) && (4 * 2 == 8)
// true && true
  (10 - 5 >= 5) || (2 * 3 != 6)
// true||false в итоге тру
   (8 / 2 == 4) && (7 % 3 != 1)
// true&&false => false
  ((3 + 4) < 8) && (12 / 3 == 4) || (5 % 2 != 1)
// true||true => true
((10 - 5) >= 5) || (6 * 2 != 12) && !(9 / 3 > 2)
// true||false && false  => приоритет за && тогда true || false => TRUE
 ((2 * 5) == 10) && !(7 - 3 < 5) || (8 / 2 == 4)
// true && false || true  itog TRUE
 ((9 + 2) < 12) && (15 % 4 != 3) || !(4 * 2 == 8)
// true && false || true => TRUE

    //((var a = 4; a-- == 4) || (5 * 2 != 10)) && (3 + 1 == 4)
    //сначала сравнение, потом декремент!! тогда true || false && true итого true


// (var b = 3; b++ > 3) && (6 / 2 == 3) || (7 - 2 != 5)
}
