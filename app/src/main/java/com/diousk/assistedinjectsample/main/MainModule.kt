package com.diousk.assistedinjectsample.main

import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner
import com.diousk.assistedinjectsample.di.viewmodel.ViewModelAssistedFactory
import com.diousk.assistedinjectsample.di.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap


@Module(includes = [MainArgs::class])
abstract class MainModule {
    @Binds
    abstract fun bindSavedStateRegistryOwner(detailActivity: MainActivity): SavedStateRegistryOwner

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindFactory(factory: MainViewModel.Factory): ViewModelAssistedFactory<out ViewModel>
}

@Module
class MainArgs {
    @Provides
    fun provideDefaultArgs(): Bundle? {
        return bundleOf("userA" to "defA")
    }
}