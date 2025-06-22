package com.awesomeapp.module_3_269

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_2_196.Repository196_5
import com.awesomeapp.module_2_172.Repository172_5
import com.awesomeapp.module_2_224.Repository224_5
import com.awesomeapp.module_2_200.Repository200_5
import com.awesomeapp.module_2_164.Repository164_5
import com.awesomeapp.module_2_232.Repository232_5
import com.awesomeapp.module_2_216.Repository216_5
import com.awesomeapp.module_2_180.Repository180_5
import com.awesomeapp.module_2_212.Repository212_5
import com.awesomeapp.module_2_176.Repository176_5
import com.awesomeapp.module_2_184.Repository184_5
import com.awesomeapp.module_2_208.Repository208_5
import com.awesomeapp.module_2_240.Repository240_5
import com.awesomeapp.module_2_204.Repository204_5


@HiltViewModel
class Viewmodel269_1 @Inject constructor(
    private val repository0: Repository196_5,
    private val repository1: Repository172_5,
    private val repository2: Repository224_5,
    private val repository3: Repository200_5,
    private val repository4: Repository164_5,
    private val repository5: Repository232_5,
    private val repository6: Repository216_5,
    private val repository7: Repository180_5,
    private val repository8: Repository212_5,
    private val repository9: Repository176_5,
    private val repository10: Repository184_5,
    private val repository11: Repository208_5,
    private val repository12: Repository240_5,
    private val repository13: Repository204_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData() + repository12.getData() + repository13.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}