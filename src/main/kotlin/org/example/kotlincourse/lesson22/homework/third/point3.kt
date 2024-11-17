package org.example.kotlincourse.lesson22.homework.third

//fun <A, B> Pair<A, B>.revert(): Pair<B, A>{
//    return Pair(this.second, this.first)
//}

private fun <C, D> Pair <C?, D?>.revert(): Pair<D?, C?> {
    return second to first
}