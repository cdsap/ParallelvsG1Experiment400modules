package com.awesomeapp.module_3_278

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_2_208.Repository208_5
import com.awesomeapp.module_2_184.Repository184_5
import com.awesomeapp.module_2_236.Repository236_5
import com.awesomeapp.module_2_164.Repository164_5


@HiltViewModel
class Viewmodel278_1 @Inject constructor(
    private val repository0: Repository208_5,
    private val repository1: Repository184_5,
    private val repository2: Repository236_5,
    private val repository3: Repository164_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}