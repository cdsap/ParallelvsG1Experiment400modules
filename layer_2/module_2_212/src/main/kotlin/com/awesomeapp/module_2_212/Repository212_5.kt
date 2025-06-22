package com.awesomeapp.module_2_212

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_160.Api160_6
import com.awesomeapp.module_1_128.Api128_6
import com.awesomeapp.module_1_112.Api112_6
import com.awesomeapp.module_1_132.Api132_6
import com.awesomeapp.module_1_100.Api100_6
import com.awesomeapp.module_1_96.Api96_6
import com.awesomeapp.module_1_144.Api144_6
import com.awesomeapp.module_1_88.Api88_6


@Singleton
class Repository212_5 @Inject constructor(
    private val api0: Api160_6,
    private val api1: Api128_6,
    private val api2: Api112_6,
    private val api3: Api132_6,
    private val api4: Api100_6,
    private val api5: Api96_6,
    private val api6: Api144_6,
    private val api7: Api88_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData()
    }
}