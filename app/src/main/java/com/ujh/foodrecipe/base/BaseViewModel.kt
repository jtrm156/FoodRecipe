package com.ujh.foodrecipe.base

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ujh.domain.utils.ErrorType
import com.ujh.domain.utils.RemoteErrorEmitter
import com.ujh.foodrecipe.widget.utils.ScreenState
import com.ujh.foodrecipe.widget.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
abstract class BaseViewModel : ViewModel(), RemoteErrorEmitter {
    val mutableProgress = MutableLiveData<Int>(View.GONE)
    val mutableScreenState = SingleLiveEvent<ScreenState>()
    val mutableErrorMessage = SingleLiveEvent<String>()
    val mutableSuccessMessage = MutableLiveData<String>()
    val mutableErrorType = SingleLiveEvent<ErrorType>()

    override fun onError(errorType: ErrorType) {
        mutableErrorType.postValue(errorType)
    }

    override fun onError(msg: String) {
        mutableErrorMessage.postValue(msg)
    }
}