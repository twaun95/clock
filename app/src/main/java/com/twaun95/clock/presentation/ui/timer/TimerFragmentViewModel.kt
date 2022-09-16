package com.twaun95.clock.presentation.ui.timer

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.MutableLiveData
import com.twaun95.clock.common.MutableNonNullLiveData
import com.twaun95.core.base.BaseViewModel

class TimerFragmentViewModel : BaseViewModel() {

    val progressValue by lazy { MutableNonNullLiveData(0) }

    fun addProgress() {

    }

}