package com.wkswind.kotlin.doc.syntax

import kotlin.properties.Delegates

/**
 * Created by Administrator on 2017/5/25.
 */
class AdminUser {
    var name : String by Delegates.observable("<no name>") {
        prop,old,new ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    val o = AdminUser()
    o.name = "hello"
    o.name = "world"
//    println(o)
}
