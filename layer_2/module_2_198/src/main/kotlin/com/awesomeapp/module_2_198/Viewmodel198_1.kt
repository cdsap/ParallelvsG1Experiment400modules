package com.awesomeapp.module_2_198

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_1_88.Repository88_5
import com.awesomeapp.module_1_132.Repository132_5
import com.awesomeapp.module_1_108.Repository108_5
import com.awesomeapp.module_1_140.Repository140_5
import com.awesomeapp.module_1_104.Repository104_5
import com.awesomeapp.module_1_120.Repository120_5


@HiltViewModel
class Viewmodel198_1 @Inject constructor(
    private val repository0: Repository88_5,
    private val repository1: Repository132_5,
    private val repository2: Repository108_5,
    private val repository3: Repository140_5,
    private val repository4: Repository104_5,
    private val repository5: Repository120_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}