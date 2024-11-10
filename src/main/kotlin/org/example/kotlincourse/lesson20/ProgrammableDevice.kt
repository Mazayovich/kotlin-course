package org.example.kotlincourse.lesson20

import Programmable

abstract class ProgrammableDevice : PowerableDevice(), Programmable {
    private var programmedAction: String = ""

    override fun programAction(action: String) {
        if (isPoweredOn) {
            programmedAction = action
            println("Программирую действие: $action.")
        } else {
            println("Невозможно запрограммировать действие, устройство выключено.")
        }
    }

    override fun execute() {
        if (isPoweredOn) {
            println("Выполняю запрограммированное действие: $programmedAction.")
        } else {
            println("Невозможно выполнить действие, устройство выключено.")
        }
    }
}
