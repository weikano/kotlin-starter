package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/25.
 */
val lazyValue : String by lazy {
    println("computed")
    "hello"
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
}
