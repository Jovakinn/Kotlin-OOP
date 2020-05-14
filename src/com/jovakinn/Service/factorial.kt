package com.jovakinn.Service

open class Factorial {
    fun factorial(num: Long): Long{
        var i = 1
        var factorial: Long = 1
        while (i <= num) {
            factorial *= i.toLong()
            i++
        }
        return factorial
    }
}