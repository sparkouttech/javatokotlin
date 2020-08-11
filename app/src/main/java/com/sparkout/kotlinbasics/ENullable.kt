package com.sparkout.kotlinbasics

// Created by krish on 06-Aug-20.
// Copyright (c) 2020 Sparkout. All rights reserved.
class ENullable {

    /*
    nullable handling
     */
    fun nullable() {
        var name: String? = "null" // nullable variable by defining the ? symbol
        println(name)
        println(name?.length)

        //assigning a null value to variable which is already assigned
        name = null
        println(name)
        println(name?.length)

        //elvis operator
        //if the variable is null returns 0 by elvis operator or if variable is assigned returns the specific length of variable
        val count = name?.length ?: 0 //difference nullable variable on using elvis operator
        println(count)
    }
}