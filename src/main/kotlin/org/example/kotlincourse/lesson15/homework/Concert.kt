package org.example.kotlincourse.lesson15.homework

import java.awt.image.BandCombineOp

class Concert(
    val band: String,
    val place: String,
   val price: Double,
   val capacity: Int
)

{ private var soldTickets: Int = 0

  fun details(){
      println("Привет! Концерт группы $band состоится тут: $place, стоимость билета - $price" +
      " вместимость зала - $capacity.")
      println("проданных билетов - $soldTickets")

  }

    fun buyTicket(){
        if (soldTickets < capacity) {
            soldTickets++
            println("Поздравляем, ты купил билет на группу $band, " +
                    "суммарно продано билетов - $soldTickets")
        }
        else {
            println ("It's sold out, dude")
        }
    }
}
