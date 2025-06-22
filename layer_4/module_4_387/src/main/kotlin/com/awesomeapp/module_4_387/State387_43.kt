package com.awesomeapp.module_4_387

sealed class State387_43 {
    data object Loading : State387_43()
    data class Success(val data: String) : State387_43()
    data class Error(val message: String) : State387_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}