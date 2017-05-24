package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/22.
 */
/**
 * classes 可以包含 constructors和initializer
 * - functions
 * - properties
 * -Nested and Inner classes
 * - Object declarations
 */
class Example //implicity inherts from Any
open class Base(p : Int)//kotlin中class和function默认都是final的，必须加上open关键字才能inherit和override
{
    open fun v(){
        println("base v()")
    }
    fun m(){
        println("base m()")
    }
}
//如果有primary constructor，可以如果下立即初始化
class Derived(p : Int) : Base(p) {
    override fun v() {
        println("derived v()")
    }
}
// 如果没有primary constructor，那么每个secondary constructor必须使用super关键字来初始化base type，或者交给其他constructor来实现这项工作
class DerivedPx : Base {
    constructor(p : Int) : super(p)
}
//class MyView : View {
//    constructor(ctx : Context) : super(ctx)
//    constructor(ctx : Context, attrs : Attribute) : super(ctx, attrs)
//}

//override property
open class Foo {
//    open val x : Int = 3
    open val x : Int get() {
        return 3
    }
}
class Bar : Foo() {
    override val x : Int = 4
}

open class A {
    open fun f() = println("A")
    fun a() = println("a")
}
//functions in intercafe are default open
interface B {
    fun f() = println("N")
    fun b() = println("n")
}

class C(val type : Int) : A(), B {
    override fun f() {
        if(type % 2== 0){
            super<A>.f()
        }else {
            super<B>.f()
        }
        println("C")
    }

}

class Properties {
    var allByDefautl : Int=1 //must have initializer or explicity fill set and get method like stringRespresentation
    var initialized = 1
    val isEmpty : Boolean get() = (allByDefautl === null)
    var stringRespresentation : String = ""
        set(value) {
            if(value.length>0) {
                field = value
            }
//            stringRespresentation = value
        }
    var setterVisibility : String = "abc"
        private set
//    var setterWithAnnotation : Any ? = null
//        set
}

interface MyInterface {
    val prop : Int
    val propertyWithImplementation : String
        get() = "foo"
    fun foo() {
        println(prop)
    }
}

class Child : MyInterface {
    override val prop: Int
        get() = 4 //To change initializer of created properties use File | Settings | File Templates.
    override val propertyWithImplementation: String
        get() = super.propertyWithImplementation.toUpperCase()
    override fun foo() {
        super.foo()
        println("override foo")
    }
}

fun main(args: Array<String>) {
//    val base = Base(3)
//    val derived = Derived(3)
//    derived.v()
//    base.v()
//    C(0).f()
//    C(1).f()
//    val p = Properties()
//    p.stringRespresentation = "hello"
//    println(p.stringRespresentation)
}

