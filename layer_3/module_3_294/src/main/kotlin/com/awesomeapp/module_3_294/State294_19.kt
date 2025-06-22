package com.awesomeapp.module_3_294

sealed class State294_19 {
    data object Loading : State294_19()
    data class Success(val data: String) : State294_19()
    data class Error(val message: String) : State294_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}