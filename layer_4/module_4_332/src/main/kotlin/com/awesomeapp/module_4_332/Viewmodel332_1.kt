package com.awesomeapp.module_4_332

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
import com.awesomeapp.module_3_244.Repository244_5
import com.awesomeapp.module_3_320.Repository320_5
import com.awesomeapp.module_3_276.Repository276_5
import com.awesomeapp.module_3_280.Repository280_5
import com.awesomeapp.module_3_260.Repository260_5
import com.awesomeapp.module_3_288.Repository288_5
import com.awesomeapp.module_3_312.Repository312_5
import com.awesomeapp.module_3_316.Repository316_5
import com.awesomeapp.module_3_304.Repository304_5
import com.awesomeapp.module_3_272.Repository272_5
import com.awesomeapp.module_3_264.Repository264_5
import com.awesomeapp.module_3_248.Repository248_5
import com.awesomeapp.module_3_284.Repository284_5
import com.awesomeapp.module_3_300.Repository300_5
import com.awesomeapp.module_3_252.Repository252_5
import com.awesomeapp.module_3_296.Repository296_5
import com.awesomeapp.module_3_308.Repository308_5


@HiltViewModel
class Viewmodel332_1 @Inject constructor(
    private val repository0: Repository256_5,
    private val repository1: Repository244_5,
    private val repository2: Repository320_5,
    private val repository3: Repository276_5,
    private val repository4: Repository280_5,
    private val repository5: Repository260_5,
    private val repository6: Repository288_5,
    private val repository7: Repository312_5,
    private val repository8: Repository316_5,
    private val repository9: Repository304_5,
    private val repository10: Repository272_5,
    private val repository11: Repository264_5,
    private val repository12: Repository248_5,
    private val repository13: Repository284_5,
    private val repository14: Repository300_5,
    private val repository15: Repository252_5,
    private val repository16: Repository296_5,
    private val repository17: Repository308_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData() + repository12.getData() + repository13.getData() + repository14.getData() + repository15.getData() + repository16.getData() + repository17.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}