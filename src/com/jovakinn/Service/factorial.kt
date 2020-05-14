package com.jovakinn.Service

open class Factorial() {
    fun factorial(num: Int){
        var i = 1
        var factorial: Long = 1
        while (i <= num) {
            factorial *= i.toLong()
            i++
        }
        println(factorial)
    }
}