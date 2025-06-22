package com.awesomeapp.module_1_88

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_28.Api28_6
import com.awesomeapp.module_0_40.Api40_6
import com.awesomeapp.module_0_64.Api64_6
import com.awesomeapp.module_0_48.Api48_6
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_76.Api76_6


@Singleton
class Repository88_5 @Inject constructor(
    private val api0: Api32_6,
    private val api1: Api24_6,
    private val api2: Api28_6,
    private val api3: Api40_6,
    private val api4: Api64_6,
    private val api5: Api48_6,
    private val api6: Api60_6,
    private val api7: Api76_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData()
    }
}