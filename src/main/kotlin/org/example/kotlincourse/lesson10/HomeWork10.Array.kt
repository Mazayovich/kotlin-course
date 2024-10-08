fun main() {
    createAndInitializeArray()
    createEmptyStringArray()
    fillArrayWithDoubleIndexes()
    modifyArrayElements()
    createNullableStringArray()
    copyArray()
    subtractArrays()
    findElementIndex()
    iterateArray()
    searchSubstringInArray(arrayOf("apple", "banana", "cherry"), "an")
}

// Задание 1: Создание и Инициализация Массива
fun createAndInitializeArray() {
    val array = arrayOf(1, 2, 3, 4, 5)
    println(array.toList())
}

// Задание 2: Создание Пустого Массива
fun createEmptyStringArray() {
    val emptyArray = Array(10) { "" }
    println(emptyArray.toList())
}

// Задание 3: Заполнение Массива в Цикле
fun fillArrayWithDoubleIndexes() {
    val array = Array(5) { 0.0 }
    for (i in array.indices) {
        array[i] = i * 2.0
    }
    println(array.toList())
}

// Задание 4: Изменение Элементов Массива
fun modifyArrayElements() {
    val array = Array(5) { 0 }
    for (i in array.indices) {
        array[i] = i * 3
    }
    println(array.toList())
}

// Задание 5: Работа с Nullable Элементами
fun createNullableStringArray() {
    val array = arrayOfNulls<String>(3)
    array[0] = null
    array[1] = "Hello"
    array[2] = "World"
    println(array.toList())
}

// Задание 6: Копирование Массива
fun copyArray() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val copiedArray = Array(array.size) { 0 }
    for (i in array.indices) {
        copiedArray[i] = array[i]
    }
    println(copiedArray.toList())
}

// Задание 7: Разница Двух Массивов
fun subtractArrays() {
    val array1 = arrayOf(10, 20, 30, 40, 50)
    val array2 = arrayOf(5, 10, 15, 20, 25)
    val resultArray = Array(array1.size) { 0 }
    for (i in array1.indices) {
        resultArray[i] = array1[i] - array2[i]
    }
    println(resultArray.toList())
}

// Задание 8: Поиск Индекса Элемента
fun findElementIndex() {
    val array = arrayOf(1, 2, 3, 4, 6)
    var index = 0
    var foundIndex = -1
    while (index < array.size) {
        if (array[index] == 5) {
            foundIndex = index
            break
        }
        index++
    }
    println(foundIndex)
}

// Задание 9: Перебор Массива
fun iterateArray() {
    val array = arrayOf(1, 2, 3, 4, 5)
    for (num in array) {
        if (num % 2 == 0) {
            println("$num: чётное")
        } else {
            println("$num: нечётное")
        }
    }
}

// Задание 10: Поиск Значения в Массиве по вхождению
fun searchSubstringInArray(array: Array<String>, searchString: String) {
    for (element in array) {
        if (element.contains(searchString)) {
            println(element)
            break
        }
    }
}
