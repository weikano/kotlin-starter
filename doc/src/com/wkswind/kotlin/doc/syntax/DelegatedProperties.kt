package com.wkswind.kotlin.doc.syntax

import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty

/**
 * Created by Administrator on 2017/5/25.
 */
class Example1 {
    var p : String by Delegate()
    var q = p
//    var o : String by {
//        operator fun getValue(thisRef : Any ? , property : KProperty<*>) : String {
//            return "yes"
//        }
//        operator fun setValue(thisRef : Any ?, property : KProperty<*> , value : String ){
//            println("by object")
//        }
//
//    }
}

class Delegate {
    operator fun getValue(thisRef:Any ? , property : KProperty<*>) : String {
        println("$thisRef, thank you for delegating '${property.name}' to me")
        if (thisRef is String) {
            return thisRef
        }
        return "WTF"
//        return ("$thisRef, thank you for delegating '${property.name}' to me")
    }
    operator fun setValue(thisRef : Any ? , property : KProperty<*>, value : String) {
        println("$value has been assigned to '${property.name}' in this $thisRef")
    }
}

fun main(args: Array<String>) {
    val o = Example1()
    o.p = "haha"
    println(o.q)
}