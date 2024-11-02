package org.example.kotlincourse.lesson18.Animals

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())
    animals.forEach { it.makeSound() }
}
