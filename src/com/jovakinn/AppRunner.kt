package com.jovakinn

import com.jovakinn.Data.enums.GENDRE
import com.jovakinn.Data.enums.OS
import com.jovakinn.Service.ExecutorClass
import com.jovakinnk.Data.enums.FILMS

fun main(args: Array<String>){
        val execute = ExecutorClass("maxmax", "qwerty",
            16, GENDRE.MALE, FILMS.MATRIX, OS.Windows)
        execute.representUser(execute)
        execute.getFavouriteFilms(execute)
        execute.getOSPreferences(execute)
        execute.calcFactorialOfAge(execute.age)
}