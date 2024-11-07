package org.example.kotlincourse.lesson19

abstract class BaseClass(

    private val privateVal: String,

    protected val protectedVal: String,
    val publicVal: String
) {

    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
    private var privateField = "добавь сеттер чтобы изменить меня из main()"

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }


    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }


    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass

    private class PrivateClass
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
fun chahgePublicField(newValue: String) { //тут меняем через сеттер пабликФилд
    publicField = newValue
}

fun changeProtectedField(newValue: String) {//тут меняем через сеттер протектед
    protectedField = newValue
}
fun changePrivateField(newValue: String) {//тут меняем приват через сеттер
    setPrivateField(newValue)
}
fun checkPrintText(){
    printText()
}
}

