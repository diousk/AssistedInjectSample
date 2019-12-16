package com.diousk.assistedinjectsample.main

import androidx.lifecycle.ViewModel
import com.diousk.assistedinjectsample.di.viewmodel.ViewModelAssistedFactory
import com.diousk.assistedinjectsample.di.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindFactory(factory: MainViewModel.Factory): ViewModelAssistedFactory<out ViewModel>
}