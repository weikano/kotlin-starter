package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/24.
 */
sealed class Expr
data class Const(val number : Double) : Expr()
data class Sum(val e1 : Expr, val e2 : Expr) : Expr()
object NotANumber : Expr()

fun eval(expr : Expr) : Double = when (expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    is NotANumber -> Double.NaN
}

fun main(args: Array<String>) {
    val e1 = Const(1.0)
    val e2 = Const(2.0)
    val sum = Sum(e1, e2)
    val nan = NotANumber
    println(eval(e1))
    println(eval(sum))
    println(eval(nan))
}