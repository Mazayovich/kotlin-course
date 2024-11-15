package org.example.kotlincourse.lesson21

class Container<T>(val item: T ){
}

class PairBox<A, B>(val first: A, val second: B){}

class LimitedContainer<A: Number>(val item: A?)

interface Storage<T>{
    fun set (item: T)
    fun get(): T
}
interface Transformer<A, B> {
    fun  transform(item: A): B

}