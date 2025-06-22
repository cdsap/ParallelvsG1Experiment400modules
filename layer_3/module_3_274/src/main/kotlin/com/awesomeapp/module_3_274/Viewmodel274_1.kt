package com.awesomeapp.module_3_274

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_2_200.Repository200_5
import com.awesomeapp.module_2_220.Repository220_5
import com.awesomeapp.module_2_224.Repository224_5
import com.awesomeapp.module_2_240.Repository240_5
import com.awesomeapp.module_2_216.Repository216_5
import com.awesomeapp.module_2_172.Repository172_5
import com.awesomeapp.module_2_196.Repository196_5
import com.awesomeapp.module_2_208.Repository208_5
import com.awesomeapp.module_2_188.Repository188_5


@HiltViewModel
class Viewmodel274_1 @Inject constructor(
    private val repository0: Repository200_5,
    private val repository1: Repository220_5,
    private val repository2: Repository224_5,
    private val repository3: Repository240_5,
    private val repository4: Repository216_5,
    private val repository5: Repository172_5,
    private val repository6: Repository196_5,
    private val repository7: Repository208_5,
    private val repository8: Repository188_5
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