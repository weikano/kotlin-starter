package com.wkswind.kotlin.doc.syntax

/**
 * Created by Administrator on 2017/5/22.
 */
//声明一个类，包含class name, header (type parameters),primary constructor和class body(花括号包围的部分)
//header 和 body 是可选的
class Invoce {

}
//省略body
class InvoceOmit

//主要构造器(primary constructor)
class Person constructor(val firstName : String)
//另一种写法, 省略掉constructor
class Person1 (val firstName: String)
//primary constructor不能包含任何代码，初始化可以用initializer block来代替
//primary constructor中的参数可以用在init代码块中
//也可以用在body 中 property初始化上
class Customer(name : String) {
    //初始化key值，可以使用name
    val key = name.toUpperCase()
    init {
        println("initializer block with $name")
    }
}
//如果primary constructor有visibility修饰符，那么constructor关键字不能省略
class NewCustomer public constructor(name : String)

//还可以定义secondary constructor，在bodyz中
class Human {
    var children : ArrayList<Human> = arrayListOf()
    constructor(parent : Human) {
        parent.children.add(this)
    }
}
//如果类中定义了primary constructor，那么secondary constructor必须delegate,通过关键字this(params,params)
class NewHuman(name : String) {
    var children : ArrayList<NewHuman> = arrayListOf()
    constructor(name : String, parent : NewHuman ) : this(name) {
        parent.children.add(this)
    }
}
//非抽象的class如果没有声明任何的constructor，不管primary还是secondary，默认会生成一个无参数的primary constructor,并且是public的
class DontCreateMe
//定义private的primary constructor,secondary constuctor也可以添加private等修饰符
class PrivateConstructor private constructor()

fun createInstanceofClass() {
    val invoce = Invoce()
    val customer = Customer("Me")
    val newHuman = NewHuman("parent")
    val newHumanChild = NewHuman("child",newHuman)

}