package org.example.kotlincourse.lesson21.homework21

class OddValidator: Validator<Int> {
    override fun validate(value: Int): Boolean{
        return value % 2 == 0 //тут остаток от деления,
        //если при делении на 2 остаток 0, то четное и будет тру
    }
}