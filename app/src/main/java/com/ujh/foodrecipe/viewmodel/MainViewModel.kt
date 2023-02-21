package com.ujh.foodrecipe.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.ujh.domain.model.FoodRecipeResponse
import com.ujh.domain.usecase.GetFoodRecipeRepoUseCase
import com.ujh.foodrecipe.base.BaseViewModel
import com.ujh.foodrecipe.widget.utils.ScreenState
import com.ujh.foodrecipe.widget.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getFoodRecipeRepoUseCase : GetFoodRecipeRepoUseCase
) : BaseViewModel() {
    val eventUserRepo : LiveData<List<FoodRecipeResponse>> get() = _eventUserRepo
    private val _eventUserRepo = SingleLiveEvent<List<FoodRecipeResponse>>()

    fun getUserRepo(owner : String) = viewModelScope.launch {
        val response = getFoodRecipeRepoUseCase.execute(this@MainViewModel, owner)

        if (response == null) mutableScreenState.postValue(ScreenState.ERROR) else {
            mutableScreenState.postValue(ScreenState.RENDER)
            _eventUserRepo.postValue(response!!)
        }
    }
}