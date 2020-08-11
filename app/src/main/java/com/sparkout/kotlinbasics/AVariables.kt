package com.sparkout.kotlinbasics

import android.util.Log

// Created by krish on 06-Aug-20.
// Copyright (c) 2020 Sparkout. All rights reserved.
class AVariables {

    //variables
    fun variables() {
        /*
       var - mutable property (can change the value anytime in the program)
       val - immutable property (cannot change the value anytime in the program)
       */
        var mName = "Sparkout"
        println(mName)
        val mAge = 27
        println(mAge)

        mName = "12345678"
        println(mName)
//        mAge = 12
        println(mAge)
    }
}