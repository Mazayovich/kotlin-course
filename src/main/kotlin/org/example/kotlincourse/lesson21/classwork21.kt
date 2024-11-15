package org.example.kotlincourse.lesson21

class BoxAny(val item: Any) {
    fun getItem(): Any {
        return item
    }
}

fun main() {
    val appleBoxAny = BoxAny("Apple")
    val intBoxAny = BoxAny(42)

    println("В коробке: ${appleBoxAny.getItem()}") // В коробке: Apple
    println("В коробке: ${intBoxAny.getItem()}")   // В коробке: 42

}

class Box<T>(val item: T) {  //тут Т - дженерик (дженериком мб любое слово, буква)
    fun getItem(): T {
        return item
    }

    fun <T> printItem(item: T) {
        println("Элемент: $item")
    }


    //ограничения для джеренериков
    fun <T: Number> sum(a: T, b: T): Double {
        return a.toDouble() + b.toDouble()
    }

}

class GenericIterator<T : Number, R : Iterable<T>>(
    private val argument: T,
    private val elements: R
) {

    fun printElements() {
        for (e in elements) {
            println(
                e.toString()
                    .repeat(argument.toInt())
            )
        }
    }
}