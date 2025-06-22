package com.awesomeapp.module_3_286

sealed class State286_21 {
    data object Loading : State286_21()
    data class Success(val data: String) : State286_21()
    data class Error(val message: String) : State286_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}