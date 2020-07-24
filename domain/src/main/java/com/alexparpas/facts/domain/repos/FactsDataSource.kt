package com.alexparpas.facts.domain.repos

import com.alexparpas.facts.domain.entities.Fact

interface FactsDataSource {
    fun getFacts(): List<Fact>

    fun getFacts(category: String): List<Fact>

    fun getFavouriteFacts(uuid: String): List<Fact>

    fun getRandomFact(): Fact

    fun getRandomFact(category: String): Fact

    fun getHistoricFact(): Fact

    fun getDailyFact(): Fact
}