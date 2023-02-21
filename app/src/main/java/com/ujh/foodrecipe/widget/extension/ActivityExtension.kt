package com.ujh.foodrecipe.widget.extension

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

fun AppCompatActivity.startActivityWithFinish(context : Context, activity : Class<*>) {
    startActivity(Intent(context, activity).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
    this.finish()
}

fun RecyclerView.showVertical(context : Context) {
    this.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
}

fun RecyclerView.showHorizontal(context : Context) {
    this.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
}