package com.wkswind.kotlin.doc.syntax

import kotlin.reflect.KClass
import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.full.declaredMemberProperties

/**
 * Created by Administrator on 2017/6/1.
 */
data class ReflectionTest(val name : String ,val age : Int)

fun main(args: Array<String>) {
//    val clazz = ReflectionTest::class
//    showProperties(clazz)
//    println("====================")
//    showFunctions(clazz)
//    val strings = listOf("a","ab","abc")
//    println(strings.filter(compose(::length,::isOdd)))
    verifyJavaKotlinProperty(ReflectionTest::class)
}

private fun showProperties(clazz : KClass<*>) {
    for (declaredMemberProperty in clazz.declaredMemberProperties) {
        println(declaredMemberProperty)
    }
}

private fun showFunctions(clazz : KClass<*>) {
    for (declaredFunction in clazz.declaredFunctions) {
        println(declaredFunction)
    }
}

private fun verifyJavaKotlinProperty(clazz : KClass<*>) {
    println(clazz.java.kotlin == clazz)
}

fun <A,B,C> compose(g:(A) -> B,f : (B) -> C) : (A) -> C {
    return {x -> f(g(x))}
}

fun length(s: String) = s.length
fun isOdd(x : Int) = x % 2 != 0
fun isOdd(s:String) = s == "brillig" || s == "slithy" || s == "tove"