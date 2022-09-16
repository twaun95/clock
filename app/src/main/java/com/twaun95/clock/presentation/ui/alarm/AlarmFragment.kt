package com.twaun95.clock.presentation.ui.alarm

import android.app.AlarmManager
import android.app.PendingIntent
import androidx.core.content.ContextCompat.getSystemService
import com.twaun95.clock.R
import com.twaun95.clock.common.Logger
import com.twaun95.clock.databinding.FragmentAlarmBinding
import com.twaun95.clock.presentation.extensions.setOnSingleClickListener
import com.twaun95.clock.presentation.ui.main.MainActivityViewModel
import com.twaun95.clock.service.AlarmHandler
import com.twaun95.clock.service.AlarmReceiver
import com.twaun95.core.base.BaseFragment
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class AlarmFragment : BaseFragment<FragmentAlarmBinding, AlarmFragmentViewModel, MainActivityViewModel>(
    R.layout.fragment_alarm) {
    override val activityVM: MainActivityViewModel by sharedViewModel()
    override val fragmentVM: AlarmFragmentViewModel by viewModel()

    private val alarmHandler by inject<AlarmHandler>()

    override fun initView() {
        super.initView()
    }

    override fun setObserver() {
        super.setObserver()
    }

    override fun setEvent() {
        super.setEvent()

        binding.buttonRegister.setOnSingleClickListener {
            Logger.d(binding.timePicker.hour)
            Logger.d(binding.timePicker.minute)
            alarmHandler.setAlarm(binding.timePicker.hour, binding.timePicker.minute)
        }
    }



    companion object {
        fun getInstance() : AlarmFragment = AlarmFragment()
    }
}