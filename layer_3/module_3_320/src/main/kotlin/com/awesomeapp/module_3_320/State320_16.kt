package com.awesomeapp.module_3_320

sealed class State320_16 {
    data object Loading : State320_16()
    data class Success(val data: String) : State320_16()
    data class Error(val message: String) : State320_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}