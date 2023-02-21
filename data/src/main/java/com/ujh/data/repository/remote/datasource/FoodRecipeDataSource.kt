package com.ujh.data.repository.remote.datasource

import com.ujh.domain.model.FoodRecipeResponse
import com.ujh.domain.utils.RemoteErrorEmitter

interface FoodRecipeDataSource {
    suspend fun getFoodRecipe(remoteErrorEmitter: RemoteErrorEmitter, owner : String) : List<FoodRecipeResponse>?
}