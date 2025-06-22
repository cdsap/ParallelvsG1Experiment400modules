package com.awesomeapp.module_3_255

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_2_240.Repository240_5
import com.awesomeapp.module_2_216.Repository216_5
import com.awesomeapp.module_2_232.Repository232_5
import com.awesomeapp.module_2_176.Repository176_5
import com.awesomeapp.module_2_228.Repository228_5


@HiltViewModel
class Viewmodel255_1 @Inject constructor(
    private val repository0: Repository240_5,
    private val repository1: Repository216_5,
    private val repository2: Repository232_5,
    private val repository3: Repository176_5,
    private val repository4: Repository228_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}