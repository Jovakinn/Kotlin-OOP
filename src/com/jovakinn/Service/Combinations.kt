package com.jovakinn.Service

data class Combinations(val n: Long? = null,
                        val k: Long? = null): Factorial() {
    val fac: Factorial = Factorial()

    fun pCombination(n: Long){
        val res = factorial(n)
        println(res)
    }

    fun aCombination(n: Long, k: Long){
        val nFac = fac.factorial(n)
        val nMinusK: Long = (n - k)
        val nMinusKfacA = fac.factorial(nMinusK)

        val res = nFac / nMinusKfacA
        println(res)
    }

    fun cCombination(n: Long, k: Long){
        val nFac = fac.factorial(n)
        val kFac = fac.factorial(k)
        val nMinusK: Long = (n - k)
        val nMinusKfacC = fac.factorial(nMinusK)

        val res = (nFac / (nMinusKfacC * kFac))
        println(res)
    }
}
