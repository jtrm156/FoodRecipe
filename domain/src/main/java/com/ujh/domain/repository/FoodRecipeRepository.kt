package com.ujh.domain.repository

import com.ujh.domain.model.FoodRecipeResponse
import com.ujh.domain.utils.RemoteErrorEmitter

interface FoodRecipeRepository {
    suspend fun getFoodRecipe(remoteErrorEmitter: RemoteErrorEmitter, owner : String) : List<FoodRecipeResponse>?
}