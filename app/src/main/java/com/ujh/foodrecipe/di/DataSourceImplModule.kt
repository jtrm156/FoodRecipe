package com.pss.clean_architecture_sample.di

import com.ujh.data.remote.api.FoodRecipeApi
import com.ujh.data.repository.remote.datasource.FoodRecipeDataSource
import com.ujh.data.repository.remote.datasourceImpl.FoodRecipeDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceImplModule {

    @Provides
    @Singleton
    fun provideMainDataSource(
        foodRecipeApi: FoodRecipeApi
    ) : FoodRecipeDataSource {
        return FoodRecipeDataSourceImpl(
            foodRecipeApi
        )
    }
}