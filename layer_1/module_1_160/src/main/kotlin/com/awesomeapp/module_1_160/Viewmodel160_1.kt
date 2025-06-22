package com.awesomeapp.module_1_160

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_0_56.Repository56_5
import com.awesomeapp.module_0_76.Repository76_5
import com.awesomeapp.module_0_20.Repository20_5
import com.awesomeapp.module_0_4.Repository4_5
import com.awesomeapp.module_0_52.Repository52_5


@HiltViewModel
class Viewmodel160_1 @Inject constructor(
    private val repository0: Repository56_5,
    private val repository1: Repository76_5,
    private val repository2: Repository20_5,
    private val repository3: Repository4_5,
    private val repository4: Repository52_5
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