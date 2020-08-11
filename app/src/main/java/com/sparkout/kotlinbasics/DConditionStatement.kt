package com.sparkout.kotlinbasics

// Created by krish on 06-Aug-20.
// Copyright (c) 2020 Sparkout. All rights reserved.
class DConditionStatement {
    /*
    conditional operators in kotlin
     */
    fun conditions() {
        var age = 52

        //if..else
        if (age % 2 == 0) {
            println("Age is even")
        } else {
            println("Age is odd")
        }

        //when
        when {
            age % 2 == 0 -> {
                println("Age is even")
            }
            else -> println("Age is odd")
        }

        /*
        range operator
        1-10 -> child
        11-20-> teenager
        21-50-> adult
        50+ -> old
         */
        when (age) {
            in 1..10 -> {
                println("Child")
            }
            in 11..20 -> {
                println("Teenager")
            }
            in 21..50 -> {
                println("Adult")
            }
            else -> {
                println("old")
            }
        }
    }
}