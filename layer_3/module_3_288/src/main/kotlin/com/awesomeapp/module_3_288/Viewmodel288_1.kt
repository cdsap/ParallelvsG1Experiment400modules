package com.awesomeapp.module_3_288

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_2_224.Repository224_5
import com.awesomeapp.module_2_164.Repository164_5
import com.awesomeapp.module_2_176.Repository176_5
import com.awesomeapp.module_2_240.Repository240_5
import com.awesomeapp.module_2_196.Repository196_5
import com.awesomeapp.module_2_232.Repository232_5
import com.awesomeapp.module_2_208.Repository208_5
import com.awesomeapp.module_2_180.Repository180_5
import com.awesomeapp.module_2_228.Repository228_5
import com.awesomeapp.module_2_192.Repository192_5


@HiltViewModel
class Viewmodel288_1 @Inject constructor(
    private val repository0: Repository224_5,
    private val repository1: Repository164_5,
    private val repository2: Repository176_5,
    private val repository3: Repository240_5,
    private val repository4: Repository196_5,
    private val repository5: Repository232_5,
    private val repository6: Repository208_5,
    private val repository7: Repository180_5,
    private val repository8: Repository228_5,
    private val repository9: Repository192_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}