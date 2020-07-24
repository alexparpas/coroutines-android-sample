package com.alexparpas.facts.data.entities.api

import com.alexparpas.facts.domain.entities.Fact

class ApiFact(
    override val id: String,
    override val tip: String,
    override val category: String?,
    override val date: String?,
    override val subcategory: String?,
    override val provider: String?
) : Fact