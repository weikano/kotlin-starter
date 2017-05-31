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

//tailrec fun findFixPoint(x:Double) : Double {
//    if(x == Math.sin(x)) {
//        return x
//    }else {
//        return findFixPoint(Math.sin(x))
//    }
//}
//
//fun <T> asListEx(vararg args : T) : List<T> {
//    val list = ArrayList<T>()
//    for (arg in args) {
//        list += arg
//    }
//    return list
//}

//fun dfs(number : Int) {
//    fun dfs(actual : Int, expected : Int) {
//
//    }
//    dfs(number, 0)
//}


fun main(args: Array<String>) {
    val func = fun Int.(other : Int) = this + other
//    val tailadd = fun Int.(other : Int) : Int {
//        val min = Math.min(this, other)
//        val max = Math.max(this, other)
//        var sum = 0
//        for(i in min .. max) {
//            sum += i
//        }
//        return sum
//    }
//    println(1.tailadd(5))

//    val ints = listOf(1,2,3,4)
//    ints.filter { fun(it,1) = it>0 }
//    println(invoke("high order function",::get))
//    println(invoke("hello",{"world"}))
//    println(invoke("here"){
//        "comes"
//    })

//    println(simple(::get))
//    println(simple { "hey" })
//    println(1.sum(2))
//    val list = asListEx(1,2,3,4)
//    for (i in list) {
//        println(i)
//    }
//    var map = mapOf("key" to 1,"map" to 2)
//    map.forEach { t, _ ->  println("key is $t")}
//    val sum : (Int, Int) -> Int = {x,y -> x+y}
//    println(sum(1,2))
}