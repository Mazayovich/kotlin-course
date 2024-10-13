package org.example.kotlincourse.lesson12

//будем писать сигнатуры (заготовки) функций

fun doSomething() {
}

fun getUserName(): String {
    return ""
}

fun printGrit(grit: String) {}

fun calcArea(area: Double, area1: Double): Double {
    return 9.0
}

fun findMax(ch1: Int, ch2: Int): Int {
    return 6
}

fun isNullOr(n: String?): Boolean {
    return false
}


fun calcDisc(disc: list<String>, arg: Int?): Double? {
    return null
}

fun sum(first: Double, sec: Double, flag: Boolean): Double {
    if flag {
        first + sec
    } else {
        first - sec
    }

    println()
}

fun printMap(xSize: Int, ySize: Int) {
    if (xSize == 0) throw IllegalArgumentException("xSize не должно быть равным нулю")
    if (ySize == 0) throw IllegalArgumentException("ySize не должно быть равным нулю")
    val formatterSize = " $xSize".length
    val xRange = if (xSize > 0) {
        0..xSize
    } else {
        0 downTo xSize
    }
    val yRange = if (ySize > 0) {
        0..ySize
    } else {
        0 downTo ySize
    }
    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in yRange) {
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