package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/24.
 */
enum class Direction {
    SOUTH, NORTH, WEST, EAST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class ProtocalState {
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };
    abstract fun signal() : ProtocalState
}

inline fun <reified T : Enum<T>> printAllValues() {
    println(enumValues<T>().joinToString { it.name })
}

fun main(args: Array<String>) {
    printAllValues<Direction>()
//    println(ProtocalState.TALKING.signal())
}