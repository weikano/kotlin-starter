package com.wkswind.kotlin.doc.syntax

import java.text.NumberFormat

/**
 * Created by Administrator on 2017/5/23.
 */
//fun <T> MutableList<T>.swap(index1:Int,index2 : Int) {
//    val tmp = this[index1]
//    this[index1] = this[index2]
//    this[index2] = tmp
//}
//
//fun Int.formatPage() : String {
//    val format = NumberFormat.getInstance()
//    val length = toString().length + 1
//    format.maximumIntegerDigits = length
//    format.minimumIntegerDigits = length
//    return format.format(this)
//}

//val String.lastChar : CharSequence
//    get() = this.subSequence(this.lastIndex..this.lastIndex)

//open class C1
//class D : C1()
//fun C1.foo() = "C"
//fun D.foo() = "D"
//
//fun printFoo(c: C1) = println(c.foo())

class MyClass {
    companion object {}
}

fun MyClass.Companion.foo() = println("companion extension foo")

fun main(args: Array<String>) {
//    printFoo(D())
//    println("abc".lastChar)
    MyClass.foo()
}

//    val page = 14
//    page.formatPage()