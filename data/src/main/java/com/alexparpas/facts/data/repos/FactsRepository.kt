package com.alexparpas.facts.data.repos

import com.alexparpas.facts.data.entities.api.ApiFact
import com.alexparpas.facts.domain.entities.Fact
import com.alexparpas.facts.domain.repos.FactsDataSource

class FactsRepository : FactsDataSource {
    override suspend fun getFacts(): List<Fact> =
        listOf(
            ApiFact(
                id = "123",
                tip = "Hello World 1",
                category = "General",
                date = null,
                subcategory = null,
                provider = null
            ),
            ApiFact(
                id = "234",
                tip = "Hello World 2",
                category = "Development",
                date = null,
                subcategory = null,
                provider = null
            ),
            ApiFact(
                id = "345",
                tip = "Hello World 3",
                category = "Development",
                date = null,
                subcategory = null,
                provider = null
            )
        )

    override suspend fun getFacts(category: String): List<Fact> =
        listOf(
            ApiFact(
                id = "234",
                tip = "Hello World 2",
                category = "Development",
                date = null,
                subcategory = null,
                provider = null
            ),
            ApiFact(
                id = "345",
                tip = "Hello World 3",
                category = "Development",
                date = null,
                subcategory = null,
                provider = null
            )
        )

    override suspend fun getFavouriteFacts(uuid: String): List<Fact> =
        listOf(
            ApiFact(
                id = "234",
                tip = "Hello World 2",
                category = "Development",
                date = null,
                subcategory = null,
                provider = null
            )
        )

    override suspend fun getRandomFact(): Fact =
        ApiFact(
            id = "123",
            tip = "Hello World 1",
            category = "General",
            date = null,
            subcategory = null,
            provider = null
        )

    override suspend fun getRandomFact(category: String): Fact =
        ApiFact(
            id = "123",
            tip = "Hello World 1",
            category = "General",
            date = null,
            subcategory = null,
            provider = null
        )

    override suspend fun getHistoricFact(): Fact =
        ApiFact(
            id = "123",
            tip = "Hello World 1",
            category = "General",
            date = null,
            subcategory = null,
            provider = null
        )

    override suspend fun getDailyFact(): Fact =
        ApiFact(
            id = "123",
            tip = "Hello World 1",
            category = "General",
            date = null,
            subcategory = null,
            provider = null
        )
}