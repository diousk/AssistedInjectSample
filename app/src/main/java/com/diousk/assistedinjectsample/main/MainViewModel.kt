package com.diousk.assistedinjectsample.main

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.diousk.assistedinjectsample.deps.UserRepo
import com.diousk.assistedinjectsample.di.viewmodel.ViewModelAssistedFactory
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import timber.log.Timber

class MainViewModel @AssistedInject constructor(
    // this handle will persist after process is killed by system
    // but still get cleared when user destroy this app
    // test by command:
    // $ adb shell am kill com.diousk.assistedinjectsample
    @Assisted val handle: SavedStateHandle,
    private val userRepo: UserRepo
) : ViewModel() {
    fun fetchUser() {
        Timber.d("userA: ${userRepo.getUser("NameA")}")
        Timber.d("handle userA: ${handle.get<String>("userA")}")
        handle.set("userA", "NameA")
    }

    @AssistedInject.Factory
    interface Factory : ViewModelAssistedFactory<MainViewModel>
}