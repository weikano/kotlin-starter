package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/25.
 */
interface Action {
    fun open()
}

class ActionImpl : Action {
    override fun open() {
        println(this)
    }
}

class ActionImplEx : Action {
    override fun open() {
        println(this)
    }
}

class Derived1(action : Action) : Action by action

fun main(args: Array<String>) {
    Derived1(ActionImpl()).open()
    Derived1(ActionImplEx()).open()
}
