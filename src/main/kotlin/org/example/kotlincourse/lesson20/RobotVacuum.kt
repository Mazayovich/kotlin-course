package org.example.kotlincourse.lesson20

import Cleanable
import Movable
import Timable

class RobotVacuum : PowerableDevice(), Movable, Cleanable {
     override fun move(direction: String, distance: Int) {
          TODO("Not yet implemented")
     }

     override fun clean() {
          TODO("Not yet implemented")
     }

}