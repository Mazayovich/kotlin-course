package org.example.kotlincourse.lesson18.Printer

abstract class Printer {
    abstract fun print(text: String)

    protected fun splitText(text: String): List<String> {
        return text.split(" ")
    }
}