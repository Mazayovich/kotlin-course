//package org.example.kotlincourse.lesson19
//
//import jdk.jfr.DataAmount
//
//
//class GamingMachine(
//    val color: String,
//    val model: String,
//    private var isPoweredOn: Boolean,
//    private var osLoaded: Boolean,
//    val availableGames: List<String>,
//    val joystick: Boolean,
//    private var amountInserted: Double,
//    private var owner: String,
//    private var supportNumber: String // точно ли стринг,
//// если там номер телефона и это цифры? уточнить или мб там вообще дабл?
//)
//
//
//fun PowerOn() {
//    isPoweredOn = true
//    osLoaded()
//}
//
//
//fun PowerOff() {
//    shutDownOperatingSystem()
//    isPoweredOn = false
//    }
//
//private fun LoadOperatingSystem() { //загрузка операционки
//    if(isPoweredOn) {
//    OsLoaded = true
//}
//
//private fun shutDownOperatingSystem() { //завершение работы операционки
//        if (isPoweredOn && osLoaded) {
//            osLoaded = false
//    }
//
//fun showAvailableGames(): List<String> { //отображение списка доступн игр
//    return availableGames
//}
//
//fun startGame(gameName: String): Boolean { //метод запуска игры
//    return if (availableGames.contains(gameName) && isPoweredOn && osLoaded) {
//
//    }
//}
//
//fun payForSession(amountInserted : Double, sessionCost: Double): Boolean{ //оплата игрового сеанса
//    return if(amountInserted >= sessionCost) {}
//
//private fun openSafeAndWithdraw(amount: Double): Boolean { //сейф открыт и выдачаа налички
// return if(amount <= earningsBalance) {
//     earningBalance = earningBalance - amount
//}
//private fun pauOutWinnings(amount: Double): Boolean{
//    return openSafeAndWithdraw(amount)
//}
//
//
//}
//
