package com.alexparpas.facts.domain.repos

import com.alexparpas.facts.domain.entities.User

interface AuthDataSource {
    fun getUser(): User
}