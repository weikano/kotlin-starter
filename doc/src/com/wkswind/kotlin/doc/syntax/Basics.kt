package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/22.
 */
/**
 * On the JVM, non-nullable values of this type are represented as values of the primitive type
 * if variable is marked ? then it is boxed
 */
fun nullableType() {
    val a : Int = 10_000
//    println(a === a)
    val boxA : Int? = a
//    val boxA : Int ? = a
//  boxA is Integer
    val boxB : Int? = a
    // === 使用的是if_acmpne指令，类似java的==
    println(boxA === boxB)
    // ===使用的是Intrinsics.areEqual方法
    println(boxA == boxB)
}

fun arrayf() {
    val a = arrayOf(1,2,3)
    val b = arrayOfNulls<Int>(5)
    val c = Array(4,{it -> it * it})
//    for (i in c) {
//        println(i.javaClass)
//    }
    println(c.javaClass)
    val d = Array(3, {it -> (it*it).toString()})
    println(d.javaClass)
//    for (s in d) {
//        println(s.javaClass)
//    }
}

fun stringLiteral() {
    val text = """
        hello,world
        this is me
    """
//    for (c in text) {
//        println(c.toChar().toInt())
//    }
    val text1 = """
        >tell me and I forget
        |Teach me and I remember
        |Invoke me and I learn
        |(Benjamin Franklin)
    """
//    println(text.length)
//    println(text)
    println(text1.trimMargin(">"))
}

fun main(args: Array<String>) {
//    nullableType()
//    arrayf()
    stringLiteral()
}