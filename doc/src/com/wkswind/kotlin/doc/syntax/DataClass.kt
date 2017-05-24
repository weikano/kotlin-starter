package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/23.
 */
open class People() {
    var gender : Int = 1
}
data class User(val name : String, val age : Int) : People()

fun main(args: Array<String>) {
    val user = User("hello",2)
    val (name,age) = user
    println("name is $name, with age $age")
}