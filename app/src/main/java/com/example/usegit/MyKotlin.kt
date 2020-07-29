package com.example.usegit

fun main(args: ArrayList<String>) {

    System.out.println("helloworld kotlin")
    //var 代表变量 kotlin可以自己推断数据类型
    //val代表常量 不可修改

    val sum2 = sum2(10)
    vars(1, 2, 3, 4)
    //lambda表达式
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }  //前面两个Int是输入的参数  后面的参数是返回的值Int类型
    print(sumLambda(1, 3))

    //可变变量定义 :var关键字
    //var<标识符>:<类型>=<初始值>
    var aa: String = "abc"
    //不可变变量定义:val 关键字
    //var<标识符>:<类型>=<初始值>
    val aaa: String = "abc"

    /**
     * 常量和变量都可以没有初始化值,但是在引用的时候必须初始化
     * 编译器支持自动类型判断,即声明时可以不指定类型,由编译器判断
     */
    val a: Int = 1
    val b = 1
    val c: Int
    c = 1

    var i = 5
    i += 5


}

/**
 * kotlin的空安全设计对于声明可为空的参数,在使用时要进行空判断处理,有两种处理方式,字段后加 !! 像Java一样抛出空异常
 * 另一种字段后加 ? 可不做处理返回值为null或配合?:做空处理
 */
fun methodNull(): Unit {
    //类型后面加 ? 表示可以为空
    var age: String? = "23"

    val toInt1 = age!!.toInt() //抛异常
    val toInt2 = age?.toInt();//为空
    val i = age?.toInt() ?: -1
    //抛出空异常
    val toInt = age!!.toInt()
    //不做处理返回null
    val ages1 = age?.toInt()
    //age 为空返回-1

    val ages2 = age?.toInt() ?: -1
}

fun parseInt(str: String):Int? {
    return null;
}


//    监狱
//    88032668
//    法制
//    88032137

/**
 * 字符串模板
 * $表示一个变量名或者变量值
 * $varName 表示变量值
 * $(varNmae.fun())表示变量的方法返回值
 */
fun method(): Unit {

    var a = 1;
    //模板中的简单名称
    val s1 = "a is $a"

    a = 2
    //模板中的任意表达式
    val s2 = "${s1.replace("is", "was")},but now is $a"
}

/**
 * 函数的变长参数可以用vararg关键字进行标识
 * 可以输入多个参数的  类似于Observable.jsut()方法
 */
fun vars(vararg args: Int) {
    for (vt in args) {
        print(vt)
    }
}

//函数定义使用关键字fun 参数格式为 参数:类型
public fun sum(a: Int, b: Int): Int {
    return a + b;
}

private fun sum2(a: Int): Int {
    return a * 10;
}

//表达式作为函数体,返回类型自动推断
public fun sum3(a: Int) = a * 10

//表示无返回的方法
public fun void(a: String): Unit {
    print(a)
}