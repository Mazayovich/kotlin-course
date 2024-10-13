package org.example.kotlincourse.lesson12
//задача 1
//Функция createHorizontalBorder:
//Отвечает за создание верхней и нижней границ прямоугольника,
// возвращая строку с нужной рамкой для заданной ширины.
//Функция printMiddleLines:
//Формирует и выводит боковые границы с заполнением
// пробелами между ними для создания тела прямоугольника.
fun drawRectangle(width: Int, height: Int) {
    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")

    print(createHorizontalBorder(width))
    printMiddleLines(width, height)
    print(createHorizontalBorder(width))
}

private fun createHorizontalBorder(width: Int): String {
    var line = "+"
    for (i in 1 until width - 1) {
        line += "-"
    }
    line += "+\n"
    return line
}

private fun printMiddleLines(width: Int, height: Int) {
    for (i in 1 until height - 1) {
        var middleLine = "|"
        for (j in 1 until width - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }
}

//задание для тех, кому скучно
//Устранение "разъезжания" таблицы:
//
//Теперь используется maxOf для вычисления размера форматирования (formatterSize).
// Это обеспечивает одинаковую ширину для ячеек таблицы, независимо от значений xSize и ySize.
//Вспомогательная функция generateRange:
//
//Изолирует логику создания диапазонов для осей X и Y,
// упрощая основную функцию и повышая читаемость кода.

//итог кода:
fun printMap(xSize: Int, ySize: Int) {
    if (xSize == 0) throw IllegalArgumentException("xSize не должно быть равным нулю")
    if (ySize == 0) throw IllegalArgumentException("ySize не должно быть равным нулю")

    //  размер формата
    val formatterSize = maxOf(xSize.toString().length, ySize.toString().length) + 1
    val xRange = generateRange(xSize)
    val yRange = generateRange(ySize)

    //  заголовок по оси X
    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()

    //  строки
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in xRange) {
            val m = i * j
            val result = when {
                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
                m % 5 == 0 -> if (i < 0) "-" else "+"
                else -> "?"
            }
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}

/// Вспомогательная функция для генерации диапазона
private fun generateRange(size: Int): IntRange {
    return if (size >= 0) {
        0..size
    } else {
        size..0
    }
}

