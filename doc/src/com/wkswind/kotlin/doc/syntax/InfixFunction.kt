package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/25.
 */
infix fun Int.sh1(x : Int) : Int = this * x

open class A1 {
    open fun foo(o : String,i : Int = 100) {}
}

class B1 : A1() {
    override fun foo(o: String, i: Int) {
        super.foo(o, i)
    }
}

fun calculate(i : Int)  {
    fun calculate(j : Int) = j*j
    for (m in 0..i){
        println(calculate(m))
    }
}

fun main(args: Array<String>) {
//    println(B1().foo("he"))
    calculate(3)
}

