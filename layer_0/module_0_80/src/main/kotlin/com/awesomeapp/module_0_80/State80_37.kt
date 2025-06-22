package com.awesomeapp.module_0_80

sealed class State80_37 {
    data object Loading : State80_37()
    data class Success(val data: String) : State80_37()
    data class Error(val message: String) : State80_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}