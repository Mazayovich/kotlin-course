fun main() {
    createEmptyIntList()
    createStringList()
    createMutableIntList()
    addElementsToList()
    removeElementFromList()
    iterateList()
    getElementByIndex()
    updateElementByIndex()
    combineTwoLists()
    findMinMaxInList()
    filterEvenNumbers()
}

// Задание 1: Создание Пустого Списка
fun createEmptyIntList() {
    val emptyList: List<Int> = listOf()
    println(emptyList)
}

// Задание 2: Создание и Инициализация Списка
fun createStringList() {
    val stringList = listOf("Hello", "World", "Kotlin")
    println(stringList)
}

// Задание 3: Создание Изменяемого Списка
fun createMutableIntList() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    println(mutableList)
}

// Задание 4: Добавление Элементов в Список
fun addElementsToList() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.add(6)
    mutableList.add(7)
    mutableList.add(8)
    println(mutableList)
}

// Задание 5: Удаление Элементов из Списка
fun removeElementFromList() {
    val mutableStringList = mutableListOf("Hello", "World", "Kotlin")
    mutableStringList.remove("World")
    println(mutableStringList)
}

// Задание 6: Перебор Списка в Цикле
fun iterateList() {
    val intList = listOf(10, 20, 30, 40, 50)
    for (element in intList) {
        println(element)
    }
}

// Задание 7: Получение Элементов Списка по Индексу
fun getElementByIndex() {
    val stringList = listOf("Apple", "Banana", "Cherry")
    println(stringList[1])  // Получение второго элемента
}

// Задание 8: Перезапись Элементов Списка по Индексу
fun updateElementByIndex() {
    val mutableIntList = mutableListOf(10, 20, 30, 40, 50)
    mutableIntList[2] = 100  // Замена элемента на позиции 2
    println(mutableIntList)
}

// Задание 9: Объединение Двух Списков
fun combineTwoLists() {
    val list1 = listOf("A", "B", "C")
    val list2 = listOf("D", "E", "F")
    val combinedList = mutableListOf<String>()
    for (element in list1) combinedList.add(element)
    for (element in list2) combinedList.add(element)
    println(combinedList)
}

// Задание 10: Нахождение Минимального/Максимального Элемента
fun findMinMaxInList() {
    val intList = listOf(3, 7, 2, 9, 5)
    var min = intList[0]
    var max = intList[0]
    for (num in intList) {
        if (num < min) min = num
        if (num > max) max = num
    }
    println("Минимум: $min, Максимум: $max")
}

// Задание 11: Фильтрация Списка
fun filterEvenNumbers() {
    val intList = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = mutableListOf<Int>()
    for (num in intList) {
        if (num % 2 == 0) {
            evenNumbers.add(num)
        }
    }
    println(evenNumbers)
}
