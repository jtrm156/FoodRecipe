package com.ujh.data.mapper

import com.ujh.domain.model.FoodRecipeResponse

object Mapper {
    fun mapperFoodRecipe(response: List<FoodRecipeResponse>?) : List<FoodRecipeResponse>? {
        return if (response != null){
            response.toDomain()
        } else null
    }

    fun List<FoodRecipeResponse>.toDomain() : List<FoodRecipeResponse> {
        return this.map {
            FoodRecipeResponse(
                it._links,
                it.count,
                it.to,
                it.hits,
                it.from
            )
        }
    }
}