package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/22.
 */
fun jump() {
    loop@ for (i in 1 .. 100) {
        innerloop@ for (j in 1..100) {
            if(i%2==0 && j%2==0) {
                break@loop
            }else{
                println("i is $i and j is $j")
            }
        }
    }
}

fun main(args: Array<String>) {
    jump()
}
