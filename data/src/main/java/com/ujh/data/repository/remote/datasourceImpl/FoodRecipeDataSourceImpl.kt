package com.ujh.data.repository.remote.datasourceImpl

import com.ujh.data.remote.api.FoodRecipeApi
import com.ujh.data.repository.remote.datasource.FoodRecipeDataSource
import com.ujh.data.utils.base.BaseRepository
import com.ujh.domain.model.FoodRecipeResponse
import com.ujh.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class FoodRecipeDataSourceImpl @Inject constructor(
    private val foodRecipeApi : FoodRecipeApi
) : BaseRepository() , FoodRecipeDataSource{
    override suspend fun getFoodRecipe(remoteErrorEmitter: RemoteErrorEmitter, owner: String): List<FoodRecipeResponse>? {
        return safeApiCall(remoteErrorEmitter){foodRecipeApi.getRepos(owner).body()}
    }
}