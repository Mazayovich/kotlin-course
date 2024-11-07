package org.example.kotlincourse.lesson19

import jdk.jfr.DataAmount


class GamingMachine(
    val color: String,
    val model: String,
    private var isPoweredOn: Boolean,
    private var osLoaded: Boolean,
    val availableGames: List<String>,
    val joystick: Boolean,
    private var amountInserted: Double,
    var owner: String,
    val supportNumber: String // точно ли стринг,
// если там номер телефона и это цифры? уточнить или мб там вообще дабл?
)


fun PowerOn() {
     isPoweredOn = true
    println("Игровой автомат включен, удачи")
}


fun PowerOff() {
         isPoweredOff = false
        println("Игровой автомат выключен, сорри")
    }

fun LoadOperatingSystem() { //загрузка операционки
    if(isPoweredOn) {
    OsLoaded = true
    println("ОС загружена")
     } else {
    println(" ОС не загружена, вруби автомат")
}

fun shutDownOperatingSystem() { //завершение работы операционки
        if (isPoweredOn && osLoaded) {
            osLoaded = false
            println("ОС завершила работу")
        } else {
            println("ОС не загружена или автомат выключен")
        }
    }

fun showAvailableGames(): List<String> { //отображение списка доступн игр
    return availableGames
}

fun startGame(gameName: String): Boolean { //метод запуска игры
    return if (availableGames.contains(gameName) && isPoweredOn && osLoaded) {
        println("Сейчас запущена игра: $gameName")
        true
    } else {
        println("Не удалось запустить игру. Проверьте настройки автомата")
        false
    }

    }
}

fun payForSession(amountInserted : Double, sessionCost: Double): Boolean{ //оплата игрового сеанса
    return if(amountInserted >= sessionCost) {
        println("Оплата игры прошла успешно")
        true
    } else {
        println("Недостаточно средств. Стоимость игры: $sessionCost.")
        false
    }

private fun openSafeAndWithdraw(amount: Double): Boolean { //сейф открыт и выдачаа налички
 return if(amount <= earningsBalance) {
     earningBalance = earningBalance - amount
     println("Вам выдано $amount.")
     true
 } else {
     println("Недостаточно средств в сейфе")
 false
 }
}
fun pauOutWinnings(amount: Double): Boolean{
    return openSafeAndWithdraw(amount)
}


}

