package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/31.
 */
inline fun <reified T> membersOf() = T::class.members

fun main(args: Array<String>) {
    println(membersOf<Int>().joinToString("\n"))
}