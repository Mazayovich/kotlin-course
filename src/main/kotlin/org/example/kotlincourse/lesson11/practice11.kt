package org.example.kotlincourse.lesson11

fun main() {
    val myMap = mapOf<String, Int>()
    val myLovingMap = mapOf(1 to "a", 2 to "b")
    val myFavoriteMap = mutableMapOf(1 to "a")
    myFavoriteMap[34] = "asf"
    println(myFavoriteMap[1])
    println(myFavoriteMap[334])

    myFavoriteMap.remove(34)

    for (entries in myLovingMap) {

        println("${entries.key}:${entries.value}")

    }
    for ((key, value) in myLovingMap) {
println("$key : $value")

    }


val myOneMap: Map<String, List<Int>> = mapOf("St" to listOf(1, 2, 4))


fun searchKey(myMap:Map<String, String>, word:String) {

    for((key, value) in myMap){
        if (value==word) return key1
    }

}


