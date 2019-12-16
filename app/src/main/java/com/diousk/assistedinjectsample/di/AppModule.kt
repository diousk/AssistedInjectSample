package com.diousk.assistedinjectsample.di

import com.diousk.assistedinjectsample.deps.UserRepo
import com.diousk.assistedinjectsample.deps.UserRepoImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class AppModule {
    @Singleton
    @Binds
    abstract fun provideUserRepo(userRepoImpl: UserRepoImpl): UserRepo
}