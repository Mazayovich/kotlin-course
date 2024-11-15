package org.example.kotlincourse.lesson21.homework21

class ListValidator<T : Number?> : Validator<List<T>> {
    override fun validate(value: List<T>): Boolean {
        for (item in value) {
            if (item == null || item.toDouble() == 0.0) {

                return false
            }
        }
        return true
    }
}