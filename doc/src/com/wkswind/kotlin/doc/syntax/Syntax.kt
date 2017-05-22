//package is not required to match directories and packages:source file can be placed arbitrarily in the file system
package com.wkswind.kotlin.doc.syntax

import java.io.File

/**
 * Created by Administrator on 2017/5/22.
 */
//define functions

fun sum(a : Int, b : Int) : Int {
   return a + b
}
// omit braces ,only body
fun sum1( a : Int, b : Int) : Int = a + b;
// omit return type
fun sum2(a : Int, b : Int) = a + b
/**
 * function return no meaningful value with return type <b>Unit</b>
 */
fun printSum(a : Int, b : Int) : Unit {
    println(a+b)
}

/**
 * return type <b>Unit</b> can be omitted
 */
fun printSum1(a : Int, b : Int){
    println(a+b)
}
//define local variable
fun local() {
    //val means read-only
    val a : Int =1
    // Int type is inferred(推断)
    val b = 2
    val c : Int //type is needed when no initializer is provided，没有提供初始化时必须指定类型
    c = 3 //defered assignment 延迟赋值
    //mutable 可变的本地变量
    var x = 5
    x += 1
}

//string template
fun stringTemplate() {
    var a = 1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is","was")}, but now is $a"
    println(s2)
}

//conditinal expressions
fun maxOf(a : Int, b : Int) = if(a>b) a else b
//nullable with ?
fun parseInt(str : String) : Int ? {
    try {
        return Integer.parseInt(str)
    }catch (e : Exception){
        return null
    }
}
fun printProduct(arg1 : String, arg2 : String) {
    val a = parseInt(arg1)
    val b = parseInt(arg2)
    if(a != null && b != null){
        println("arg1 can be $a, and arg2 can be $b")
    }else {
        println("$arg1 or $arg2 cannot be parsed into Int")
    }
}

/**
 * type check using keyword <b>is</b> and no need to cast it explicity <br>
 * this is smart cast
 */
fun getStringLength(obj : Any) : Int {
//    if(obj is String) {
//        return obj.length
//    }
//    return -1
//    or
    if(obj !is String) {
        return -1
    }
    return obj.length
}

//forloop
fun forloop(items : List<String>) {
    for (item in items) {
        println(item)
    }
}

fun whileloop(items : List<Any>) {
    var index = 0
    while(index < items.size) {
        println(items[index])
        index ++
    }
}

fun whenf(obj : Any) {
    when(obj) {
        is String -> println(obj)
        else -> println("not a String")
    }
}

fun returnByWhen(obj : Any) : Int {
    return when(obj) {
        is String -> 1
        else -> 0
    }
}

fun rangef() {
    val x = 10
    val y = 9
    for (x in 1..y+1){
        println("x in range")
    }
}

fun numberRange() {
    val list = listOf("a","b","c")
    if(-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if(list.size !in list.indices){
        println("list size is out of valid list indices range too")
    }
}

fun lazyProperty() : String {
    val p : String by lazy { "test" }
    return p
}

fun nullshorthand() {
    val files = File("Test").listFiles();
    println(files?.size)
}

fun main(args: Array<String>) {
//    stringTemplate()
//    println(maxOf(1,2))
//    printProduct("3","4")
//    println(getStringLength("abc"))
//    println(getStringLength(1))
//    forloop(listOf("1","2"))
//    whileloop(listOf(1,2,3,4))
//    whenf(1)
//    whenf("hello")
//    println(returnByWhen(1))
//    println(returnByWhen(false))
//    println(returnByWhen("hello"))
//    numberRange()
//    println(lazyProperty())

    nullshorthand()
}