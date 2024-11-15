package org.example.kotlincourse.lesson21.homework21


//8

class StringValidator: Validator<String>  {
    override fun validate(value: String): Boolean {
        return !value.isNullOrBlank()
    }
} //ПОЧЕМУ ПОДЧЕРКИВАЕЕЕЕЕЕЕЕТ
