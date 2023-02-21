package com.ujh.domain.usecase

import com.ujh.domain.repository.FoodRecipeRepository
import com.ujh.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class GetFoodRecipeRepoUseCase @Inject constructor(
    private val foodRecipeRepository : FoodRecipeRepository
) {
    suspend fun execute(remoteErrorEmitter: RemoteErrorEmitter, owner : String) = foodRecipeRepository.getFoodRecipe(remoteErrorEmitter, owner)
}