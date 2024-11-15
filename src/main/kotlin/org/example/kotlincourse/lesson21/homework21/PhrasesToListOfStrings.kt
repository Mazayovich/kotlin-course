package org.example.kotlincourse.lesson21.homework21

//задание 5
class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun map(input: String): List<String> {
        return input.split(" ")
    }

//ОНО САМО СДЕЛАЛОСЬ ШТО


//ЗАДАНИЕ 6. ОБНОВЛЕННЫЙ МАППЕР

override fun mapList(inputs: List<String>): List<List<String>> {
    return inputs.map { it.split(" ") }
}
}


//7

interface Validator<T>{
    fun validate(value: T): Boolean
} //eto vse????


