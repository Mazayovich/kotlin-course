package org.example.kotlincourse.lesson20

import WaterContainer


abstract class Refrigerator : TemperatureOpenableDevice(), WaterContainer {
    override val capacity : Int = 10
    override fun fillWater(amount: Int){}
    override fun getWater(amount: Int) {
    }

}