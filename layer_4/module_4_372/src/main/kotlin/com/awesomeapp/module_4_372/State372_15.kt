package com.awesomeapp.module_4_372

sealed class State372_15 {
    data object Loading : State372_15()
    data class Success(val data: String) : State372_15()
    data class Error(val message: String) : State372_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}