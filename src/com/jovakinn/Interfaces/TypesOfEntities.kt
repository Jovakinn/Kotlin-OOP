package com.jovakinn.Interfaces

import com.jovakinn.Data.User

interface TypesOfEntities {
    fun representUser(user: User)
    fun getFavouriteFilms(user: User)
    fun getOSPreferences(user: User)
}
