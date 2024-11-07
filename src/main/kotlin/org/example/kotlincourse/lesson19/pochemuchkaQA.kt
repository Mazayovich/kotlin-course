package org.example.kotlincourse.lesson19

abstract class BaseClass(
    // объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    private val privateVal: String, //вообще поле приват недоступно для дургих классов, но
    //но тут при создании объекта childrenClass значение  поля privateVal передается через конструктор
    // в класс  BaseClass. По итогу даже если поле недоступно для того, чтобы внести в него изменения,
    //значение я могу использовать внутри класса  ChildrenClass





    // объясни, почему это поле недоступно в main()
    protected val protectedVal: String,
    val publicVal: String
    //потому что модификатор протектед. оно доступно только внутри самого класса BaseClass
    //и всего, что имеет отношение к нему (наслденики)
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

    // объясни, почему эта функция не может быть публичной
    protected open fun getProtectedClass() = ProtectedClass()
    //потому что протектед. в пределах класса и наследников вызвать можем, вне - нет
    //нарушится инкапсуляция (ДА же?)

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // объясни, почему эта функция не может быть публичной или protected
    private fun getPrivateClass() = PrivateClass()
    //потому что приват. значит, она доступна только в пределах класса BasicClass
    //если б была публичной или протектед, к ней можно было бы обращаться из др классов и наследников
    // а это тоже противоречит инкапсуляции (ДА? я вообще не уверена в том, что несу.
    // ПРОСТИТЕ ВСЕ, КТО ЭТО ВИДИТ!)

    protected class ProtectedClass

    private class PrivateClass
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    publicVal: String
    //аргумент протектедВал доступен в мэин, потому что в конструкторе BasicClass
    //(родительский класс) этот аргумент используется для передачи значений
    //в поле протектедВад базового класса. так как мы передаем его через конструктор
    //родителя, он становится доступным в методах и конструкторах класса
    //в том числе и в мэйне при создании объекта
) : BaseClass(privateVal, protectedVal, privateVal) {

    // объясни, почему в main() доступна функция getAll() хотя её здесь нет

// она доступна через класс BaseClass, от которого наследуется и childrenClass
    //когда класс наследует другой класс, он автоматом получает доступ ко всем публичным
    //защищенным методам родительского класса, в том числе и гетАлл, даже
    //если она переопределена в дочернем классе. Собственно, это и есть наследование,
    // тут дочерний класс имеет полное право использовать методы род класса
    // только если они не закрыты модификатором доступа приват!!!!









    // проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
}

// когда мы вызовем принтлн, она выовет метод приватПринт родительского класса
//BaseClass, тк в дочернем ChildrenClass метод приватПринт локально переопределен
//как приват метод. То есть при вызове принтТекст будет выведено
// "Печать из класса BaseClass", а не "Печать из класса  "ChildrenClass""
// это из-за того, что метод приватПринт в ChildrenClass не может использоваться
//родительским классом, так как он приватный. Из-за того, что в дочернем он приватный,
// ты его не вызовешь в родительском классе