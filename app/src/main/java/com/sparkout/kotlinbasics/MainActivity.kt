package com.sparkout.kotlinbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var mName:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val mString = main("Krishna")
//        println(mString)
//        mainSingleExpression("Learn","Android")
//        forLoop()

        mName="Sparkout"

        val testClass = Test(23,45.0)

        val addition = Addition(10,20,30)
//        addition.add()
        println(addition.add())
    }

    /*
    how to create a function (method)
     */
    fun main() {
        println("Sparkout")
    }

    //return type function too
    fun main(string: String):String {
        println(string)
        return string
    }

    //default parameter
    fun mainDefault(name1: String, name2: String) {
        val mConcat = name1.plus(name2)
        val mConcat3 = "$name1 $name2"
        println(mConcat)
        println(mConcat3)
    }

    //named parameter (assign default values)
    fun mainNamed(name1: String = "Hello", name2: String = "Sparkout"):String {
        return "$name1 $name2"
    }

    //single expression function
    fun mainSingleExpression(name1: String, name2: String) = println("$name1 $name2")

    //for loop
    fun forLoop() {
        //list, indicies, withIndex
        val list = listOf("Sparkout", "Tech", "Solutions")
        for (i in 0 until list.size) {
            println(i)
        }
    }

    //for_each loop
    fun forEachLoop() {
        //list, withIndex
        val list = listOf("Sparkout", "Tech", "Solutions")
        list.forEach { index ->
            println(index)
        }
    }

    //constructor, secondary constructor and so on, init
    inner class Test(val mInt: Int, val mDouble: Double) {

        /*init {
            //initializer block
            mInt = 100
        }*/

        var age = mInt
        val valueDouble = mDouble
        var mList = ArrayList<String>()

        constructor(dDouble: Double) : this(1234, dDouble)
//        constructor(list: ArrayList<String>) : this(70, 5.0) {
//            this.mList = list
//        }
    }

    //Singleton class in kotlin -> declare object before class name
}
