package com.ujh.data.remote.model

data class FoodRecipeResponse(
    val _links: Links,
    val count: Int,
    val from: Int,
    val hits: List<Hit>,
    val to: Int
)