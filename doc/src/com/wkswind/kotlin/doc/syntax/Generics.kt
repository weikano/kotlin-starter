package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/24.
 */
fun copy(from : Array<out Any>, to : Array<Any>) {
    assert(from.size == to.size)
    for(i in from.indices) {
        to[i] = from[i]
    }
}

//fun init() :Array<Any> = arrayOf()

fun main(args: Array<String>) {
    val from : Array<Int> = arrayOf(1,2,3)
    val to : Array<Any> = Array<Any>(3,{""})
    copy(from, to)
//    println(from)
//    println(to)
    for(i in to.indices) {
        println(to[i])
    }
//    copy(from, to)
}
