package com.alexparpas.facts.domain.repos

import com.alexparpas.facts.domain.entities.Fact

interface FactsDataSource {
    suspend fun getFacts(): List<Fact>

    suspend fun getFacts(category: String): List<Fact>

    suspend fun getFavouriteFacts(uuid: String): List<Fact>

    suspend fun getRandomFact(): Fact

    suspend fun getRandomFact(category: String): Fact

    suspend fun getHistoricFact(): Fact

    suspend fun getDailyFact(): Fact
}