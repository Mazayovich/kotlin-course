package org.example.kotlincourse.lesson21.homework21

//задание 1
fun <K, V> toMap(keys: list<K>, values: list<V>): Map<K, V> {
    val map = mutableMapOf<K, V>()
    for (i in 0 until minOf(keys.size, values.size)) {
    map[keys[i]] = values[i]
    }
    return map
    }
//что я тут сделала:
//1. создала карту мап
// 2.прошлась по циклу до минимального размера
// списков ключей и значений
//3. на каждой итерации добавила элемент в карту с индексом i
//в виде ключа и значения



//задание 2
fun <T> getMiddleElement(list: List<T>): T?{
    return when {
        list.isEmpty() -> null
        else -> list.size / 2]
    }
}
//чето не уверена, вернуться перепроверить


