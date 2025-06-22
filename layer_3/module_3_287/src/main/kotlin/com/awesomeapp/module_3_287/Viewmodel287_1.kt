package com.awesomeapp.module_3_287

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
import com.awesomeapp.module_2_232.Repository232_5
import com.awesomeapp.module_2_236.Repository236_5
import com.awesomeapp.module_2_204.Repository204_5
import com.awesomeapp.module_2_192.Repository192_5
import com.awesomeapp.module_2_196.Repository196_5
import com.awesomeapp.module_2_168.Repository168_5
import com.awesomeapp.module_2_240.Repository240_5
import com.awesomeapp.module_2_200.Repository200_5
import com.awesomeapp.module_2_208.Repository208_5
import com.awesomeapp.module_2_172.Repository172_5
import com.awesomeapp.module_2_176.Repository176_5
import com.awesomeapp.module_2_220.Repository220_5


@HiltViewModel
class Viewmodel287_1 @Inject constructor(
    private val repository0: Repository224_5,
    private val repository1: Repository232_5,
    private val repository2: Repository236_5,
    private val repository3: Repository204_5,
    private val repository4: Repository192_5,
    private val repository5: Repository196_5,
    private val repository6: Repository168_5,
    private val repository7: Repository240_5,
    private val repository8: Repository200_5,
    private val repository9: Repository208_5,
    private val repository10: Repository172_5,
    private val repository11: Repository176_5,
    private val repository12: Repository220_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData() + repository12.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}