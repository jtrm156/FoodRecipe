package com.ujh.data.repository

import com.ujh.data.mapper.Mapper
import com.ujh.data.repository.remote.datasource.FoodRecipeDataSource
import com.ujh.domain.model.FoodRecipeResponse
import com.ujh.domain.repository.FoodRecipeRepository
import com.ujh.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class FoodRecipeRepositoryImpl @Inject constructor(private val foodRecipeDataSource : FoodRecipeDataSource) : FoodRecipeRepository{
    override suspend fun getFoodRecipe(
        remoteErrorEmitter: RemoteErrorEmitter,
        owner: String
    ): List<FoodRecipeResponse>? {
        return Mapper.mapperFoodRecipe(foodRecipeDataSource.getFoodRecipe(remoteErrorEmitter, owner))
    }
}