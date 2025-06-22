package com.awesomeapp.module_1_148

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_0_48.Api48_6
import com.awesomeapp.module_0_16.Api16_6
import com.awesomeapp.module_0_36.Api36_6
import com.awesomeapp.module_0_56.Api56_6
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_80.Api80_6
import com.awesomeapp.module_0_40.Api40_6
import com.awesomeapp.module_0_68.Api68_6


@Singleton
class Repository148_5 @Inject constructor(
    private val api0: Api8_6,
    private val api1: Api48_6,
    private val api2: Api16_6,
    private val api3: Api36_6,
    private val api4: Api56_6,
    private val api5: Api60_6,
    private val api6: Api80_6,
    private val api7: Api40_6,
    private val api8: Api68_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData()
    }
}