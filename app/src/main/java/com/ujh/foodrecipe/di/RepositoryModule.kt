package com.pss.clean_architecture_sample.di

import com.ujh.data.repository.FoodRecipeRepositoryImpl
import com.ujh.data.repository.remote.datasourceImpl.FoodRecipeDataSourceImpl
import com.ujh.domain.repository.FoodRecipeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideMainRepository(
        foodRecipeDataSourceImpl: FoodRecipeDataSourceImpl
    ): FoodRecipeRepository {
        return FoodRecipeRepositoryImpl(
            foodRecipeDataSourceImpl
        )
    }
}