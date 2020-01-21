package com.diousk.assistedinjectsample.main

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProviders
import com.diousk.assistedinjectsample.R
import com.diousk.assistedinjectsample.di.viewmodel.DaggerAwareViewModelFactory
import dagger.android.support.DaggerAppCompatActivity
import timber.log.Timber
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @Inject lateinit var viewModelFactory: DaggerAwareViewModelFactory
    private val viewModel by viewModels<MainViewModel> { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.fetchUser()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Timber.d("onSaveInstanceState, save userA to mainA")
        outState.putString("userA", "mainA")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val initPosition = savedInstanceState.getString("userA")
        Timber.d("onRestoreInstanceState, restore userA $initPosition")
    }
}
