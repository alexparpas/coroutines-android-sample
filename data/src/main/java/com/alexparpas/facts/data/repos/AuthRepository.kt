package com.alexparpas.facts.data.repos

import com.alexparpas.facts.data.entities.api.ApiUser
import com.alexparpas.facts.domain.entities.User
import com.alexparpas.facts.domain.repos.AuthDataSource

class AuthRepository : AuthDataSource {
    override fun getUser(): User =
        ApiUser(
            id = "123",
            name = "Alex",
            email = "alex@gmail.com",
            avatar = "avatar.com"
        )
}