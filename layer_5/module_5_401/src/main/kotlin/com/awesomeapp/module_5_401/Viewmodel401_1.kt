package com.awesomeapp.module_5_401

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_4_324.Repository324_5
import com.awesomeapp.module_4_328.Repository328_5
import com.awesomeapp.module_4_332.Repository332_5
import com.awesomeapp.module_4_336.Repository336_5
import com.awesomeapp.module_4_340.Repository340_5
import com.awesomeapp.module_4_344.Repository344_5
import com.awesomeapp.module_4_348.Repository348_5
import com.awesomeapp.module_4_352.Repository352_5
import com.awesomeapp.module_4_356.Repository356_5
import com.awesomeapp.module_4_360.Repository360_5
import com.awesomeapp.module_4_364.Repository364_5
import com.awesomeapp.module_4_368.Repository368_5
import com.awesomeapp.module_4_372.Repository372_5
import com.awesomeapp.module_4_376.Repository376_5
import com.awesomeapp.module_4_380.Repository380_5
import com.awesomeapp.module_4_384.Repository384_5
import com.awesomeapp.module_4_388.Repository388_5
import com.awesomeapp.module_4_392.Repository392_5
import com.awesomeapp.module_4_396.Repository396_5
import com.awesomeapp.module_4_400.Repository400_5


@HiltViewModel
class Viewmodel401_1 @Inject constructor(
    private val repository0: Repository324_5,
    private val repository1: Repository328_5,
    private val repository2: Repository332_5,
    private val repository3: Repository336_5,
    private val repository4: Repository340_5,
    private val repository5: Repository344_5,
    private val repository6: Repository348_5,
    private val repository7: Repository352_5,
    private val repository8: Repository356_5,
    private val repository9: Repository360_5,
    private val repository10: Repository364_5,
    private val repository11: Repository368_5,
    private val repository12: Repository372_5,
    private val repository13: Repository376_5,
    private val repository14: Repository380_5,
    private val repository15: Repository384_5,
    private val repository16: Repository388_5,
    private val repository17: Repository392_5,
    private val repository18: Repository396_5,
    private val repository19: Repository400_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData() + repository12.getData() + repository13.getData() + repository14.getData() + repository15.getData() + repository16.getData() + repository17.getData() + repository18.getData() + repository19.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}