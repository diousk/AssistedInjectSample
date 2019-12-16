package com.diousk.assistedinjectsample.deps

import javax.inject.Inject
import javax.inject.Singleton

interface UserRepo {
    fun getUser(name: String): User
}

data class User(val name: String)

@Singleton
class UserRepoImpl @Inject constructor(): UserRepo {
    override fun getUser(name: String): User {
        return User(name)
    }
}