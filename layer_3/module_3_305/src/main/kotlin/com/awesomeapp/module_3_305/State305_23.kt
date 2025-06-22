package com.awesomeapp.module_3_305

sealed class State305_23 {
    data object Loading : State305_23()
    data class Success(val data: String) : State305_23()
    data class Error(val message: String) : State305_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}