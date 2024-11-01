package org.example.kotlincourse.lesson17

open class FurnitureType(
    typeOfAppointment: String,
    val purchaseType: String // тип покупки - бюджетная/люкс
) : Furniture(typeOfAppointment)