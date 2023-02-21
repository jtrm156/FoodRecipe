package com.ujh.data.remote.api

import com.ujh.domain.model.FoodRecipeResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface FoodRecipeApi {
    @GET("/api/recipes/v2/{owner}")
    suspend fun getRepos(@Query("owner") owner : String) : Response<List<FoodRecipeResponse>>
}