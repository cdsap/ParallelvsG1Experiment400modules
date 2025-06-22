package com.awesomeapp.module_4_344

sealed class State344_38 {
    data object Loading : State344_38()
    data class Success(val data: String) : State344_38()
    data class Error(val message: String) : State344_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}