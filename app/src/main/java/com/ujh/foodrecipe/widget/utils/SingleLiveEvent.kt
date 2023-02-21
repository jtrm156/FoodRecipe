package com.ujh.foodrecipe.widget.utils

import androidx.lifecycle.MutableLiveData

class SingleLiveEvent<T> : MutableLiveData<T>() {
    companion object {
        private const val TAG = "SingleLiveEvent"
    }
}