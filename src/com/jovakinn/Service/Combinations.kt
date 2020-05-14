package com.jovakinn.Service

/*
    Work in progress...K
 */

data class Combinations(val n: Long? = null,
                        val k: Long? = null): Factorial() {
    val fac: Factorial = Factorial()

    fun pCombination(n: Long){
        val res = factorial(n)
        println(res)
    }

    fun aCombination(n: Long, k: Long){
        val nFac = fac.factorial(n).toString()
        val nMinusK: Long = (n - k)
        val nMinusKfacA = fac.factorial(nMinusK).toString()

        val res: String = (nFac.toLong() /
                nMinusKfacA.toLong())
                .toString()
        println(res)
    }

    fun cCombination(n: Long, k: Long){
        val nFac = fac.factorial(n).toString()
        val kFac = fac.factorial(k).toString()
        val nMinusK: Long = n-k

        val nMinusKfac = fac.factorial(nMinusK)
            .toString()

        val res: String = (nFac.toLong() /
                nMinusKfac.toLong() * kFac.toLong())
                .toString()
        println(res)
    }


}
