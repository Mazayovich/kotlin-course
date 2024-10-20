package org.example.kotlincourse.lsson14

fun main() {

    val map = mapOf<String, Int>()

    for (entry in map.entries) {
        println("Key:${entry.key} = Value:${entry.value}")
    }

    println(map.values)
    println(map.keys)

    val mapStorage = mapOf<String, Int>()

    println(mapStorage.getOrElse("Kiwi") { throw Exception("Is not kiwi now") })
    println(map.containsKey("Banana"))
    println(map.containsValue(10))

    val listOfFruit = mapStorage.map { "Product: ${it.key} in count ${it.value}" }

    mapStorage.isEmpty()
    mapStorage.isNotEmpty()

    mapStorage.all { it.value > 10 }
    mapStorage.any { it.value > 100 }
    mapStorage.filterValues { it > 100 }

    val mutableMapStorage = mapStorage.toMutableMap()
    mutableMapStorage.remove("pineaple")
    mutableMapStorage.putAll(mapOf())
    mutableMapStorage.clear()


}