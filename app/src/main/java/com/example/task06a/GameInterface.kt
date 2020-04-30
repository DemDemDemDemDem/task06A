package com.example.task06a

interface GameInterface {
    //This value represents the state of the 'game'. It should be initialised to 0
    var counter: Int

    //This function will take the parameter oper, and if the value is passed is '+'
    //it will increment 'counter' and if the value is passed is '-',
    //it will decrement 'counter'
    fun buttonPressed(oper: Char): Unit
}