package org.example.kotlincourse.lesson18.Printer

class LaserPrinter : Printer() {
    override fun print(text: String) {
        splitText(text).forEach { word ->
            println(word)
        }
    }
}