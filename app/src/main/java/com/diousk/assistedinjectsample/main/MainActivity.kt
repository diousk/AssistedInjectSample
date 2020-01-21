package com.diousk.assistedinjectsample.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProviders
import com.diousk.assistedinjectsample.R
import com.diousk.assistedinjectsample.di.viewmodel.DaggerAwareViewModelFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @Inject lateinit var viewModelFactory: DaggerAwareViewModelFactory
    private val viewModel by viewModels<MainViewModel> { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.fetchUser()
    }
}
