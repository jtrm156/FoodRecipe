package com.ujh.foodrecipe.di

import android.app.Application
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatDelegate
import com.bumptech.glide.Glide
import dagger.hilt.android.HiltAndroidApp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@HiltAndroidApp
class GlobalApplication : Application() {
    companion object {
        private lateinit var application : GlobalApplication
        fun getInstance() : GlobalApplication = application
    }

    override fun onCreate() {
        super.onCreate()
        application = this
    }
}