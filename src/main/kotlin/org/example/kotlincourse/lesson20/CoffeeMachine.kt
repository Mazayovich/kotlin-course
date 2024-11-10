package org.example.kotlincourse.lesson20

import Programmable
import WaterContainer

class CoffeeMachine : TemperatureOpenableDevice(), WaterContainer, Programmable {
     fun setTemperature(temp: Int) {
          TODO("Not yet implemented")
     }

     override val capacity: Int
          get() = TODO("Not yet implemented")

     override fun fillWater(amount: Int) {
          TODO("Not yet implemented")
     }

     override fun getWater(amount: Int) {
          TODO("Not yet implemented")
     }

     override fun programAction(action: String) {
          TODO("Not yet implemented")
     }

     override fun execute() {
          TODO("Not yet implemented")
     }

}

open class TemperatureOpenableDevice {
}
