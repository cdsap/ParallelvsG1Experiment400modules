package com.awesomeapp.module_2_240

sealed class State240_20 {
    data object Loading : State240_20()
    data class Success(val data: String) : State240_20()
    data class Error(val message: String) : State240_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}