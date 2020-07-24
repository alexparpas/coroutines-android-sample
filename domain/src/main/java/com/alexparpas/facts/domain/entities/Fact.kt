package com.alexparpas.facts.domain.entities

interface Fact {
    val id: String
    val tip: String
    val date: String?
    val category: String?
    val subcategory: String?
    val provider: String?
}