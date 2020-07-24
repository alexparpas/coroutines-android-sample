package com.alexparpas.facts.data.entities.api

import com.alexparpas.facts.domain.entities.User

class ApiUser(
    override val id: String,
    override val name: String,
    override val email: String,
    override val avatar: String
) : User