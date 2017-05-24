package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/23.
 */
interface Factory<T> {
    fun create() : T
}

class ClassMy {
    companion object factory: Factory<ClassMy> {
        override fun create(): ClassMy = ClassMy()
    }
}

fun main(args: Array<String>) {
    val instance = ClassMy.create()
}