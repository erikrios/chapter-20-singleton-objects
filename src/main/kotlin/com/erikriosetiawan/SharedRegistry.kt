package com.erikriosetiawan

object SharedRegistry {
    fun register(key: String, thing: Any) {
        println("$thing are registered with key: $key")
    }
}