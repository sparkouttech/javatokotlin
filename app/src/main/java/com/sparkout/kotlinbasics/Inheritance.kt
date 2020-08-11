package com.sparkout.kotlinbasics

// Created by krish on 06-Aug-20.
// Copyright (c) 2020 Pikchat. All rights reserved.
open class BaseAddition(val num1: Int, val num2: Int) {
    open fun add() = num1.plus(num2)
}

class Addition(val valueOne: Int, val valueTwo: Int, val valueThree: Int) :
    BaseAddition(valueOne, valueTwo) {
}