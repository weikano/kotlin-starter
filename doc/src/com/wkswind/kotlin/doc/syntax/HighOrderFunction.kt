package com.wkswind.kotlin.doc.syntax

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

/**
 * Created by Administrator on 2017/5/25.
 */
//fun <T> lock(lock : Lock, body : ()-> T) : T {
//    try {
//        lock.lock()
//        println("locked")
//        return body()
//    }finally {
//        lock.unlock()
//    }
//}
//
//fun get() = 1
//fun <T> invoke(msg : String, body:()->T) : T {
//    println(msg)
//    return body()
//}
//
//fun get() = 1
//
//fun <T> simple(body : ()-> T) = body()

//val sum = fun Int.(other : Int) = this+ other

tailrec fun findFixPoint(x:Double) : Double {
    if(x == Math.sin(x)) {
        return x
    }else {
        return findFixPoint(Math.sin(x))
    }
}

fun main(args: Array<String>) {
//    println(invoke("high order function",::get))
//    println(invoke("hello",{"world"}))
//    println(invoke("here"){
//        "comes"
//    })

//    println(simple(::get))
//    println(simple { "hey" })
//    println(1.sum(2))
}