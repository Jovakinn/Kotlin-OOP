package com.jovakinn.Service

/*
    Work in progress...K
 */

data class Combinations(val n: Int? = null,
                        val k: Int? = null): Factorial() {
    val fac: Factorial = Factorial()

    fun pCombination(n: Int){
        val res = factorial(n)
        println(res)
    }

    fun aCombination(n: Int, k: Int){
        val nFac = fac.factorial(n).toString()
        val nMinusK: Int = n-k
        val nMinusKfac = fac.factorial(nMinusK).toString()

        val res: String = (nFac.toInt() / nMinusKfac.toInt())
                as String
        println(res)
    }

    fun cCombination(n: Int, k: Int){
        val nFac = fac.factorial(n).toString()
        val kFac = fac.factorial(k).toString()
        val nMinusK: Int = n-k
        val nMinusKfac = fac.factorial(nMinusK).toString()

        val res: String = (nFac.toInt() / nMinusKfac.toInt() * kFac.toInt())
                as String
        println(res)
    }


}
