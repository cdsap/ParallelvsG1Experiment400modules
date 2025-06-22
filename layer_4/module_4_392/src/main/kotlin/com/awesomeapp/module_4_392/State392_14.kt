package com.awesomeapp.module_4_392

sealed class State392_14 {
    data object Loading : State392_14()
    data class Success(val data: String) : State392_14()
    data class Error(val message: String) : State392_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}