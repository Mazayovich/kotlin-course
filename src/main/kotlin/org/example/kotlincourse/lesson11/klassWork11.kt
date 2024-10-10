package org.example.kotlincourse.lesson11

//СЛОВАРИ
//pair
fun main(){

    val pair: Pair<Int, String> = 10 to "a"

    val emptyMap1: Map<String, String> = mapOf<String, String>()


    val capitals = mapOf<String, String>()
    val emptyMap: Map<String, String> = mapOf<String, String>()
    val mutableCapitals = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")

    val capitalOfRussia = capitals["Россия"]
    mutableCapitals["Германия"] = "Берлин"
    mutableCapitals.remove("Франция")

    for (entries in mutableCapitals) {
        println("${entries.key} : ${entries.value}")
    }
    for ((country, capital) in capitals) {
        println("$country: $capital")
    }
    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)


}