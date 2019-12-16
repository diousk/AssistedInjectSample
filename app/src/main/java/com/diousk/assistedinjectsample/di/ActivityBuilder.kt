package com.diousk.assistedinjectsample.di

import com.diousk.assistedinjectsample.main.MainActivity
import com.diousk.assistedinjectsample.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun contributesMain(): MainActivity
}