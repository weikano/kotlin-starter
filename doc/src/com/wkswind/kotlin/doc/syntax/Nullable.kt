package com.wkswind.kotlin.doc.syntax

fun String?.lengthEx() : Int = this?.length ?: -1

fun main(args: Array<String>) {
    var a : String ? = "abc"
    println(a?.length)
    a = null
    println(a?.length)
//    a = null
//    println(a.lengthEx())
}
