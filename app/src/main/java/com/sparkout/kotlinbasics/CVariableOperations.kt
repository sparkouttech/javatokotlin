package com.sparkout.kotlinbasics

// Created by krish on 06-Aug-20.
// Copyright (c) 2020 Sparkout. All rights reserved.
class CVariableOperations {
    /*
    certain set of operations and convertions which we can perform with variables
    */
    fun operations() {
        var mNum = 10

        println(mNum)
        println(mNum.toString()) //similar we can convert to long,float,char,byte,string

        //maths operations
        var mValue = 20
        var mValue2 = 40

        println(mValue.plus(mValue2)) //addition of two variables

        //concat two variables kotlin syntax, also similar for double,float.etc
        println(mValue.toString().plus(mValue2.toString()))

        //to bring multiple lines
        var triple = """
            uihgouishiushsf
            jksbndvkjnsiudfvns
            njksdbvklsdvbilsdf
            bihsgioushglissoiug
        """.trimIndent()

        println(triple) //to align values in new line
    }
}