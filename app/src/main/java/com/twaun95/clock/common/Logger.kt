package com.twaun95.clock.common

import android.util.Log

object Logger {

    private const val TAG = "TAEWAUN"

    fun d(message: Any) { Log.d(TAG, "$message") }
}