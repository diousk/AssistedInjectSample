package com.diousk.assistedinjectsample.main

import androidx.lifecycle.ViewModel
import com.diousk.assistedinjectsample.deps.UserRepo
import com.diousk.assistedinjectsample.di.viewmodel.ViewModelAssistedFactory
import com.squareup.inject.assisted.AssistedInject
import timber.log.Timber

class MainViewModel @AssistedInject constructor(
    private val userRepo: UserRepo
) : ViewModel() {
    fun fetchUser() {
        Timber.d("userA: ${userRepo.getUser("NameA")}")
        Timber.d("userB: ${userRepo.getUser("NameB")}")
    }

    @AssistedInject.Factory
    interface Factory : ViewModelAssistedFactory<MainViewModel>
}