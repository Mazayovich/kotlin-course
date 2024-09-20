package org.example.kotlincourse.Lesson5

// Задача 1
//Начальную интенс-ть звука задаю переменной initialIntensity, = 100.0
fun main() {
    // Задаю начальную интенсивность звука
    val initialIntensity = 100.0 // теперь это начальная интенсивность

    // вариант 1. коэффициент затухания известен
    val knownDampingCoefficient: Double? = 0.7 // допустим, коэффициент затухания будет 0.7
    // функция для расчета
    val intensityWithKnownCoefficient = calculateDampedSoundIntensity(initialIntensity, knownDampingCoefficient)
    // Печатаю результат
    println("Интенсивность звука с известным коэффициентом затухания: $intensityWithKnownCoefficient")

    // вариант 2. коэффициент затухания неизвестен
    val unknownDampingCoefficient: Double? = null // коэфф-нт затухания тогда отсутствует
    // вызываю функцию, чтобы получить результат
    val intensityWithUnknownCoefficient = calculateDampedSoundIntensity(initialIntensity, unknownDampingCoefficient)
    // Печатаю результат
    println("Интенсивность звука с неизвестным коэффициентом затухания: $intensityWithUnknownCoefficient")
}

// здесь функция считает интенсивность звука после затухания:
fun calculateDampedSoundIntensity(initialIntensity: Double, dampingCoefficient: Double?): Double {
    // Если коэффициент затухания  null, то использую 0.5 как стандартное значение
    val effectiveDampingCoefficient = dampingCoefficient ?: 0.5
    // Рассчитываю интенсивность после затухания
    return initialIntensity * effectiveDampingCoefficient
}


//Задача 2

fun main() {

    fun main() {
        // Начинаю с определения стоимости груза

        val cargoValue: Double? = null // можно тут попробовать задать значение, например, 100.0

        // вызываю функцию, чтобы рассчитать полную стоимость доставки
        val totalCost = calculateTotalShippingCost(cargoValue)

        // Печатаю результат
        println("Полная стоимость доставки: $${"%.2f".format(totalCost)}") // Форматируем для удобства
    }

    // тут будет функция для расчета полной стоимости доставки
    fun calculateTotalShippingCost(cargoValue: Double?): Double {
        // Шаг 1: устанавливаю стандартную стоимость, если стоимость груза не указана
        val effectiveCargoValue = cargoValue ?: 50.0 // Если cargoValue null, использую 50.0

        // Шаг 2: Рассчитываю страховку, которая составляет 0,5% от стоимости груза
        val insurance = effectiveCargoValue * 0.005 // 0.5% от стоимости

        // Шаг 3: Теперь я могу рассчитать полную стоимость доставки
        val totalShippingCost = effectiveCargoValue + insurance // Полная стоимость = стоимость груза + страховка

        // Возвращаю полную стоимость доставки
        return totalShippingCost
    }


    // Задача 3
    fun main() {
        // задаю переменную для атмосферного давления
        //  использую тип Double?, чтобы обозначить, что значение может быть null (отсутствовать)
        val atmosphericPressure: Double? = getPressureReading() // Получаю показания давления

        // Шаг 2: Проверяю, получили ли мы показания
        if (atmosphericPressure == null) {
            // Если показания отсутствуют, выводим сообщение об ошибке
            println("Ошибка: отсутствуют показания атмосферного давления.")
        } else {
            // Если показания есть, выводим их на экран
            println("Показания атмосферного давления: $atmosphericPressure гПа") //- исчисления в гигапаскалях?
        }
    }

    // тут будет функция для получения показаний атмосферного давления

    fun getPressureReading(): Double? {

    }
