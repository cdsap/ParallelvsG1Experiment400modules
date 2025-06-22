package com.awesomeapp.module_4_334

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_3_256.Repository256_5
import com.awesomeapp.module_3_304.Repository304_5
import com.awesomeapp.module_3_264.Repository264_5
import com.awesomeapp.module_3_312.Repository312_5
import com.awesomeapp.module_3_288.Repository288_5
import com.awesomeapp.module_3_252.Repository252_5
import com.awesomeapp.module_3_320.Repository320_5
import com.awesomeapp.module_3_284.Repository284_5
import com.awesomeapp.module_3_260.Repository260_5


@HiltViewModel
class Viewmodel334_1 @Inject constructor(
    private val repository0: Repository256_5,
    private val repository1: Repository304_5,
    private val repository2: Repository264_5,
    private val repository3: Repository312_5,
    private val repository4: Repository288_5,
    private val repository5: Repository252_5,
    private val repository6: Repository320_5,
    private val repository7: Repository284_5,
    private val repository8: Repository260_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}