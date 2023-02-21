package com.ujh.foodrecipe.view

import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.hilt.lifecycle.ViewModelFactoryModules
import androidx.lifecycle.ViewModelProvider
import com.ujh.domain.model.FoodRecipeResponse
import com.ujh.domain.repository.FoodRecipeRepository
import com.ujh.domain.usecase.GetFoodRecipeRepoUseCase
import com.ujh.domain.utils.RemoteErrorEmitter
import com.ujh.foodrecipe.R
import com.ujh.foodrecipe.base.BaseActivity
import com.ujh.foodrecipe.databinding.ActivityMainBinding
import com.ujh.foodrecipe.viewmodel.MainViewModel
import com.ujh.foodrecipe.widget.utils.ScreenState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val mainViewModel by viewModels<MainViewModel>()
    override fun init() {
        binding.activity = this
        observeViewModel()
    }

    fun clickSearchBtn(view : View) {
        mainViewModel.getUserRepo(binding.githubNameEditTxt.text.toString())
    }

    private fun observeViewModel() {
        mainViewModel.mutableScreenState.observe(this) {
            Log.d("로그", "$it")
            when (it) {
                ScreenState.RENDER -> shortShowToast("성공!")
                ScreenState.ERROR -> shortShowToast("에러 발생!!")
                else -> shortShowToast("알수없는 에러 발생!!")
            }
        }

        mainViewModel.eventUserRepo.observe(this) {
            it.map { item ->
                binding.responseTxt.text = item.count.toString()
            }
        }
    }
}