package org.example.kotlincourse.lesson20

abstract class WashingMachine (
     val deviceId : String
) : Powerable, TemperatureRegulatable, WaterContainer, Drainable, Timable