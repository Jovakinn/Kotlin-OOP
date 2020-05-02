package com.jovakinn.Data

import com.jovakinn.Data.enums.GENDRE
import com.jovakinn.Data.enums.OS
import com.jovakinn.Interfaces.TypesOfEntities
import com.jovakinnk.Data.enums.FILMS

open class User (val login: String = "hello",
                 val password: String,
                 val age: Int, val gendre: GENDRE,
                 val favouriteFilm: FILMS,
                 val favouriteOS: OS) : TypesOfEntities {

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
