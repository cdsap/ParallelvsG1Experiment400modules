package com.awesomeapp.module_2_176

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_1_104.Repository104_5
import com.awesomeapp.module_1_108.Repository108_5
import com.awesomeapp.module_1_112.Repository112_5
import com.awesomeapp.module_1_152.Repository152_5
import com.awesomeapp.module_1_156.Repository156_5
import com.awesomeapp.module_1_136.Repository136_5
import com.awesomeapp.module_1_148.Repository148_5
import com.awesomeapp.module_1_160.Repository160_5
import com.awesomeapp.module_1_100.Repository100_5
import com.awesomeapp.module_1_120.Repository120_5
import com.awesomeapp.module_1_92.Repository92_5
import com.awesomeapp.module_1_144.Repository144_5
import com.awesomeapp.module_1_116.Repository116_5
import com.awesomeapp.module_1_124.Repository124_5
import com.awesomeapp.module_1_96.Repository96_5
import com.awesomeapp.module_1_140.Repository140_5
import com.awesomeapp.module_1_132.Repository132_5
import com.awesomeapp.module_1_88.Repository88_5
import com.awesomeapp.module_1_84.Repository84_5


@HiltViewModel
class Viewmodel176_1 @Inject constructor(
    private val repository0: Repository104_5,
    private val repository1: Repository108_5,
    private val repository2: Repository112_5,
    private val repository3: Repository152_5,
    private val repository4: Repository156_5,
    private val repository5: Repository136_5,
    private val repository6: Repository148_5,
    private val repository7: Repository160_5,
    private val repository8: Repository100_5,
    private val repository9: Repository120_5,
    private val repository10: Repository92_5,
    private val repository11: Repository144_5,
    private val repository12: Repository116_5,
    private val repository13: Repository124_5,
    private val repository14: Repository96_5,
    private val repository15: Repository140_5,
    private val repository16: Repository132_5,
    private val repository17: Repository88_5,
    private val repository18: Repository84_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData() + repository12.getData() + repository13.getData() + repository14.getData() + repository15.getData() + repository16.getData() + repository17.getData() + repository18.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}