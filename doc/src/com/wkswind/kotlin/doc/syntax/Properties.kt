package com.wkswind.kotlin.doc.syntax

import kotlin.reflect.KProperty0

/**
 * Created by Administrator on 2017/6/1.
 */
fun main(args: Array<String>) {
    val prop = "abc"::length
    println(prop.get())
}