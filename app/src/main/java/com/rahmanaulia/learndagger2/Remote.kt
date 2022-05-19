package com.rahmanaulia.learndagger2

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor(){
    companion object{
        private const val TAG = "Car"
    }

    fun setListener(car: Car){
        Log.d(TAG, "setListener: Remote Connected")
    }
}