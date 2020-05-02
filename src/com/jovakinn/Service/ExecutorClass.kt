package com.jovakinn.Service

import com.jovakinn.Data.User
import com.jovakinn.Data.enums.GENDRE
import com.jovakinn.Data.enums.OS
import com.jovakinnk.Data.enums.FILMS

class ExecutorClass(
    login: String = "hello",
    password: String,
    age: Int,
    gendre: GENDRE,
    favouriteFilm: FILMS,
    favouriteOS: OS
) : User(login, password, age, gendre, favouriteFilm, favouriteOS) {
    fun calcFactorialOfAge (age: Int) {
        for (i in age downTo 0 step 1){
            val res: Int = i * (i-1)
            println(res)
        }
    }
}