package com.pss.clean_architecture_sample.di

import com.ujh.domain.repository.FoodRecipeRepository
import com.ujh.domain.usecase.GetFoodRecipeRepoUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    @Singleton
    fun provideGetFoodRecipeRepoUseCase(repository: FoodRecipeRepository) = GetFoodRecipeRepoUseCase(repository)
}