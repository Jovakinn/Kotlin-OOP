package com.jovakinn.Data

import com.jovakinn.Data.enums.GENDRE
import com.jovakinn.Data.enums.OS
import com.jovakinn.Interfaces.TypesOfEntities
import com.jovakinn.Service.Factorial
import com.jovakinnk.Data.enums.FILMS

open class User (
    private val login: String = "hello",
    private val password: String,
    val age: Int, private val gendre: GENDRE,
    private val favouriteFilm: FILMS,
    private val favouriteOS: OS) : TypesOfEntities, Factorial() {

    override fun representUser(user: User) {
        println("Login: ${user.login}")
        println("Password: ${user.password}")
        println("Age: ${user.age}")
        println("Gender: ${user.gendre}")
        println("Favourite film: ${user.favouriteFilm}")
        println("Favourite OS: ${user.favouriteOS}")
    }

    override fun getFavouriteFilms(user: User) {
        println("Really cool film, and my favourite is: ${user.favouriteFilm}")
    }

    override fun getOSPreferences(user: User) {
        println("The best OS ever: ${user.favouriteOS}")
    }

}
