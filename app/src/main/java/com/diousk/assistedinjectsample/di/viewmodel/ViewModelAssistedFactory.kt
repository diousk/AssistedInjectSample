package com.diousk.assistedinjectsample.di.viewmodel

import androidx.lifecycle.ViewModel

interface ViewModelAssistedFactory<T : ViewModel> {
    fun create(): T
}