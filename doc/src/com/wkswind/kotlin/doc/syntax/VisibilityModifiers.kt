package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/23.
 */
open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    override val b = 5
}

class Unrelated(o : Outer) {
    //o.a, o.b not visible
    //o.c and o.d visible
    //Outer.Nested not visible, Nested::e not visible
}
