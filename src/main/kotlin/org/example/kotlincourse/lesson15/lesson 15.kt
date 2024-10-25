package org.example.kotlincourse.lesson15

//ООП
//определение классов и обьектов
//класс - это чертеж, объект - экземпляр класса
// (созданный по чертежуавтомобиль - это экземпляр чертежа класса, например)

fun main() {
    val igor = Person("Igor", 30)
    igor.sayHello()

    Logger.log("saff")
    val result=Calculator.add(1,4)

    val myLampe=Lamp(true)
    myLampe.switch()

    val myWind=Wind(300)

    println(myWind.convertSpeed())

    val carOne =Car(Car.brands[0], "vesta")
    carOne.sayMyName()
}




