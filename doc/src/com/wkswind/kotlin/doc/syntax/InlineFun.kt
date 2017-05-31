package com.wkswind.kotlin.doc.syntax

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

/**
 * Created by Administrator on 2017/5/26.
 */

//inline fun lock(lock : Lock, operator : ()->Unit) {
//    try {
//        lock.lock()
//        operator()
//    }finally {
//        lock.unlock()
//    }
//}

//inline fun mix(inlined : ()->Int,noinline uninlined : ()->Int) = inlined()+uninlined()
//fun b() = 1+2

fun main(args: Array<String>) {
//    val lock = ReentrantLock(true)
//    lock(lock) {
//        println("hello")
//    }
//    println(mix({1},{2}))
//    val list = listOf(1,2,3)
//    list.forEach {
//        println(it)
//    }
//    println(mix({
//        println("this is inline")
//        2
//    }, ::b))
}
