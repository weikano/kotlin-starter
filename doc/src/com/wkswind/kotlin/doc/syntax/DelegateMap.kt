package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/25.
 */
class AdminUserEx(val map : Map<String, Any ?>) {
    val name : String by map
    val age : Int by map
}

fun main(args: Array<String>) {
    val user = AdminUserEx(mapOf(
            "name" to "Hello",
            "age" to 1
    ))
    println(user.name +"," + user.age)
}
