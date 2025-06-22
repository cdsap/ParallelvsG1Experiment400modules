package com.awesomeapp.module_4_399

sealed class State399_8 {
    data object Loading : State399_8()
    data class Success(val data: String) : State399_8()
    data class Error(val message: String) : State399_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}