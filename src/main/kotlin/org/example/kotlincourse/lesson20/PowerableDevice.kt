package org.example.kotlincourse.lesson20

import Powerable

abstract class PowerableDevice : Powerable {
var isPoweredOn: Boolean = false

    override fun powerOn() {
        isPoweredOn = true
        println("Включаю устройство")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("Выключаю устройство")
    }

}