package org.example.kotlincourse.lesson20

abstract class Refrigerator (
    override val deviceId : String
): Powerable, Openable, TemperatureRegulatable