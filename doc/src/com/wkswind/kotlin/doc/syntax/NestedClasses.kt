package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/24.
 */
class Outer1 {
    private val bar : Int = 1
    //编译成静态内部类
    class Nested1 {
        fun foo() = 2
    }
    //内部类
    inner class Inner1 {
        fun foo() = bar
    }
}

fun main(args: Array<String>) {
    println(Outer1().Inner1().foo())
//    println(Outer1.Nested1().foo())
}