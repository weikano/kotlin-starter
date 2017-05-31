package com.wkswind.kotlin.doc.syntax

import kotlin.coroutines.experimental.EmptyCoroutineContext
import kotlin.coroutines.experimental.buildSequence

/**
 * Created by Administrator on 2017/5/31.
 */
data class Normal(val name : String, val age : Int)

fun main(args: Array<String>) {
//    val people = Normal("hehe",20)
//    val (name, age) = people
//    println(name)
//    println(age)
//    println(people.component1())
//    println(people.component2())

//    val readonly = listOf(1,2,3)
    val readonly = setOf(1,2,3)
    println(readonly.toList())
}
