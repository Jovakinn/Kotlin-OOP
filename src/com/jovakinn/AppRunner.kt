package com.jovakinn

import com.jovakinn.Service.Combinations

fun main(args: Array<String>){

        // combinatorics
        val comb = Combinations()
        comb.pCombination(5)
        comb.aCombination(10, 2)
        comb.cCombination(15,2)

    val stringList = mutableListOf("one", "two", "three", "four")
    val stringSet = setOf("One", "Two", "Three")
    val numbIterator = stringList.listIterator()

    while (numbIterator.hasNext())
        println(numbIterator.next())
    println(stringList.slice(1..3))

    println(stringList.binarySearch("t"))

    val mutableMap = mutableMapOf("1" to 1, "2" to 2, "3" to 3)
    val filteredMap = mutableMap.filter { (key, value) -> key.endsWith("1") && value > 0 }
    println(filteredMap)

    printAll(stringList)
    printAll(stringSet)

    val map = mutableMapOf("1" to 1, "2" to 2, "3" to 3)
    println(map)
    map["1"] = 66
    map.put("4", 4)
    println(map)

}

fun printAll(strings: Collection<String>){
    for (s in strings){
        print("$s ")
        println()
    }
}