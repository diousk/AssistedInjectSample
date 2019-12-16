package com.diousk.assistedinjectsample.di.viewmodel

import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.Module

@AssistedModule
@Module(includes = [AssistedInject_ViewModelAssistedModule::class])
abstract class ViewModelAssistedModule