package com.example.usegit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception
import java.math.BigInteger
import java.util.*

class KotlinActivity : AppCompatActivity(), View.OnClickListener {
    private var bt_toast: Button? = null//先声明
    private var tv_title: TextView? = null
    val pi = 3.1415926f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        bt_toast = findViewById(R.id.bt_toast)
        tv_title = findViewById(R.id.tv_title)
        tv_title!!.setText("修改了内容")
        bt_toast?.setOnClickListener((this))
        val returnBig = returnBig(1, 2)
        nullMethod(null)
        var i = 3;
        var j = { x: Int, y: Int -> x + y } //参数可以使用函数来表示
        var result = j(3, 5)
        println(i)
        var stringValue = showMethod(1, 2)

        var e = { a: Int, b: Int -> a + b }

        getBall(3.14f, 4.0f)
        getCircle(3.14f, 2.0f) //等同于下面的写法
        getCircle(r = 2.0f);//如果PI的值已经指定 那么可以这样写  也叫具名函数

    }
    /**
     * 递归计算阶乘  5的阶乘是 5*4*3*2*1   4的阶乘 4*3*2*1 3的阶乘3*2*1  2的阶乘 2*1   1的阶乘 1
     */
    fun fact(num:Int):Int{
        if (num==1)
            return 1
        return num*fact(num-1)
    }

    //处理大的数据 比如100的阶乘  如果不这样写会报错
    fun factBig(num: BigInteger):BigInteger{
        if (num==BigInteger.ONE) {  //BigInteger.ONE 表示为 1
            return BigInteger.ONE
        }
        return num*factBig(num-BigInteger.ONE);
    }


    /**
     * 递归函数
     */
    fun diGui(a:Int):Int{
        if (a==1){
            return 1
        }
        return a+diGui(a-1)

    }
    /**
     * while方法
     */
    fun whileMethod(a:Int):Int{
        var sum = 0
        while (sum<5){
            sum+=1
        }
        return sum
    }
    /**
     * kotlin的异常处理
     */
    fun excetionMethod():Unit{
        try {
            var a = 3/0
        }catch (e:Exception){
            println("出现了异常,请检查"+e.message)
        }
        finally {
            //不管有没有异常,都会走到这个地方
        }
    }
    /**
     * 计算器 calcDemo
     * !!表示不能为空
     * ?表示可以为空
     */
    fun calDemo():Unit{
        print("请输入第一个数字")
        var readLine = readLine()
        var toInt1 = readLine!!.toInt()

        var readLine1 = readLine
        var toInt = readLine1!!.toInt()
        var sum =toInt+toInt1
    }

    /**
     * 字符串 数字的转换
     */
    fun methodStringToInt(): Unit {
        var a = "13"
        var b = 13
        a = b.toString() //Int转化成String
        b = a.toInt() //String转化成Int

        var c ="a3"
        b = c.toInt() //这样会运行时报异常
    }

    /**
     * 获取球2的表面积 4PIRR
     */
    fun getBall(PI: Float = pi, r: Float): Float {
        return 4 * PI * r * r
    }

    /**
     * 圆柱体的体积 2PI*R*h
     */
    fun getYuanzhu(PI: Float = pi, r: Float, h: Float): Float {
        return PI * r * r * h
    }

    /**
     * 园的周长  2*PI*R
     */
    fun getCircle(PI: Float = pi, r: Float): Float {
        return 2 * PI * r
    }

    /**
     * 园的周长  PI*直径
     */
    fun getCircle1(PI: Float = pi, R: Float): Float {
        return PI * R
    }

    /**
     * * kotlin的默认参数和具名参数
     * 获取长方形的面积
     */
    fun getRectArea(a: Float, b: Float): Float {
        return a * b
    }


    fun showMethod2(a: Int, b: Int) = a.toString() + b

    /**
     * 函数和函数表达式
     */
    fun showMethod(a: Int, b: Int): String {

        return a.toString() + b
    }

    //等价于 下面的写法
    fun showMethod1(a: Int, b: Int) = a + b

    /**
     * map的使用
     */
    fun methodMap(): Unit {
        var map = TreeMap<String, String>() //声明一个map
        map["好"] = "good"
        map["学习"] = "study"
        map["天"] = "day"
        map["上"] = "up"
//     for (value in map){
//         val value1 = value.value
//         val key = value.key
//     }

        print(map["好"]) //打印good

    }

    /**
     *List
     * 方法的使用
     */
    fun methodList(): Unit {
        var lists = listOf<String>("one", "two", "Three", "four");
        for (num in lists) {
            println(num)
        }
        for ((i, e) in lists.withIndex()) {//i代表下标  e代表值   带下标的遍历
            println("$i,$e")
        }


    }


    /**
     * 1 until 100 表示为[1,100)  1到100的前闭后开区间
     * reVersed() 翻转
     * .count() 获取有多少个数
     */
    fun sumMe2(): Unit {
        var nums = 1 until 100 //[1,100) 表示开区间
        var nums2 = 1..100   //[1,100]
        var num3 = 1 until 100  //[1,100)
        for (num in num3 step 2) {  //在[1,100)的前闭后开集合中 每两个打印输出
            println(num)
        }
        //reversed()方法 表示翻转  倒着输出
        val reversed = num3.reversed()
        val count = num3.count() //count()方法是集合的数量
    }

    /**
     * kotlin中的区间和循环
     * 区间  1 .. 100 表示从 1 到 100 的循环
     * 关键字  in 表示在什么里面
     *
     */
    fun sumNumber(): Unit {
        var nums = 1..100  //表示 1到100 的值 表示闭区间 [1,100]
        var result = 0
        for (num in nums) {
            println(num)
            result += num
        }
        println("1加到100的和是${result}")
    }

    /**
     * when 相当于 Java的 switch 语句
     * kotlin的 when 表达式
     * 满足条件就执行代码
     * 10分满分
     * 9分干的不错
     * 8分还可以
     * 7分还需要努力
     * 6分刚好及格
     * 其他(需要加油了)
     */
    fun gradeStudent(score: Int): Unit {
        when (score) {
            10 -> print("考了满分,棒棒哒")
            9 -> print("干的不错")
            8 -> print("还可以")
            7 -> print("还需努力")
            6 -> println("刚好及格")
            else -> println("需要需要加油哦")
        }
    }

    fun diaryGenerator(placeName: String): Unit {
        var diary = """
            今天天气晴朗,万里无云,我们去${placeName}游玩,首先映入眼帘的是${placeName}${numToChinese(placeName.length)}个鎏金大字
        """.trimIndent()
    }

    fun numToChinese(num: Int): String {
        return when (num) {
            1 -> "一"
            2 -> "二"
            3 -> "三"
            4 -> "四"
            5 -> "五"
            else -> "地名太长了,我不记不清了"
        }
    }

    /**
     * kotlin出现空值  空值的处理
     * 接受一个参数  这个参数是非空的 除非做处理
     * 可以避免掉空指针
     * 参数类型后面+?  String?  表示传入的参数可以为null
     */
    fun nullMethod(str: String?): String {
        return "热${str}"
    }

    /**
     * kotlin中的==  就是Java中的 .equals()方法
     * str1.equals(str1, false)//第二个参数代表忽略字母的大小写
     */
    fun method(): Unit {
        var str1 = "张三"
        var str2 = "张二"
        print(str1 == str2)

        str1.equals(str2)

        str1.equals(str1, false)//第二个参数代表忽略字母的大小写
    }

    /**
     * 条件控制 颜值判断器 >80 帅哥 <=80 衰哥
     */
    fun checkFace(score: Int): String = if (score > 80) "帅哥" else "衰哥"

    /**
     * 返回两个数当中较大的哪个
     */
    fun returnBig(a: Int, b: Int): Int {
        var info = """
            ${a}            和            ${b}            较大的哪个为
        """.trimIndent()
        if (a > b) return a else return b
    }

    //字符串模板  ${var}
    fun diaryGenerate(placeNme: String): String {
        var temple = """
            今天天气晴朗,万里无云,我们去${placeNme}游玩,
            首先映入眼帘的是,${placeNme}${placeNme.length}个鎏金打字.
        """

        var temp1 = "这里是${placeNme}"
        return temple + temp1
    }

    /**
     *
     *fun为固定写法  sayHello为参数名 name为参数 String为参数类型  String为返回值的类型
     * 函数名为sayHello 方法返回值是String类型,一个参数为String类型 名称为name
     */
    fun sayHello(name: String): String {
        return "你好";
    }

    /**
     * 函数名为checkAge 方法的返回值是Boolean类型,一个参数是整数类型 名称为age
     */
    fun checkAge(age: Int): Boolean {
        if (age > 18)
            return true
        return false
    }

    fun saveLog(logLevel: Int): Unit {
        print("打印日志")
    }

    //
    //加方法
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    //减方法
    fun sub(a: Int, b: Int): Int {
        return a - b;
    }

    //乘方法
    fun squre(a: Int, b: Int): Int {
        return a * b
    }

    //除方法
    fun multi(a: Int, b: Int): Int {
        return a / b
    }

    override fun onClick(p0: View?) {
        Toast.makeText(this, "使用kotlin点击事件", Toast.LENGTH_SHORT).show();
    }
}