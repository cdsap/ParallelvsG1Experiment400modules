package com.awesomeapp.module_4_366

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_3_248.Repository248_5
import com.awesomeapp.module_3_288.Repository288_5
import com.awesomeapp.module_3_260.Repository260_5
import com.awesomeapp.module_3_244.Repository244_5
import com.awesomeapp.module_3_300.Repository300_5
import com.awesomeapp.module_3_304.Repository304_5
import com.awesomeapp.module_3_312.Repository312_5


@HiltViewModel
class Viewmodel366_1 @Inject constructor(
    private val repository0: Repository248_5,
    private val repository1: Repository288_5,
    private val repository2: Repository260_5,
    private val repository3: Repository244_5,
    private val repository4: Repository300_5,
    private val repository5: Repository304_5,
    private val repository6: Repository312_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}