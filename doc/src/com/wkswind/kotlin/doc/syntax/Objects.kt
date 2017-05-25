package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/24.
 */
//open class A1(x : Int) {
//    open val y = x
//}
//
//interface B1{}
//
//val ab : B1 = object : A1(4),B1 {
//    override val y = 15
//}
class C1 {
    private fun foo() = object {
        val x = "x"
    }

    public fun publicFoo() = object {
        val x = "x"
    }

    fun bar() {
        foo().x
        //publicFoo().x
        //public 方法，无法访问object成员
    }
}

fun main(args: Array<String>) {
//    val x1 = C1().
}