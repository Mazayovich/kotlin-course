package org.example.kotlincourse.lesson20

interface Powerable {
    fun powerOn()
    fun PowerOff()
}

interface TemperatureRegulatable {
    fun setTemperature(temp: Int)
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount:Int)
    fun getWater(amount:Int)
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time:Int)
}


interface LightEmitting {
    fun emitLight()

}

interface Movable {
    fun move(direction: String, dustance: Int)
}

interface Cleanable {
    fun clean()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface BatteryOperated {
    fun  getCapacity(): Double
    fun replaceBattery()
}

interface SoundEmitting {
    fun setVolume(volume:Int)
    fun mute()
    fun playSound()
}

interface Programmable{
    fun programAction(action: String)
    fun execute()
}