package com.ujh.domain.model

data class Ingredient(
    val food: String,
    val foodId: String,
    val measure: String,
    val quantity: Int,
    val text: String,
    val weight: Int
)