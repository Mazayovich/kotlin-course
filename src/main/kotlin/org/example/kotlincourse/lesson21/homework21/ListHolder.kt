package org.example.kotlincourse.lesson21.homework21


//задание 3
class ListHolder<T> {
val items = mutableListOf<T>()
    fun addItem(item: T){
        items.add(item)
    }

    fun getAllItems(): List<T>{
        return items.toList()
    }
}


//задание 4
interface Mapper<T, R>{
    fun map(input: T): R
    fun mapList(inputs: List<String>): List<List<String>>
}

