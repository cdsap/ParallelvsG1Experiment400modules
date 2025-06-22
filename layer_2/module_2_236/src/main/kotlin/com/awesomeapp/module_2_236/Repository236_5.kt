package com.awesomeapp.module_2_236

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_96.Api96_6
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_120.Api120_6
import com.awesomeapp.module_1_128.Api128_6
import com.awesomeapp.module_1_144.Api144_6
import com.awesomeapp.module_1_100.Api100_6
import com.awesomeapp.module_1_148.Api148_6
import com.awesomeapp.module_1_108.Api108_6
import com.awesomeapp.module_1_136.Api136_6
import com.awesomeapp.module_1_116.Api116_6


@Singleton
class Repository236_5 @Inject constructor(
    private val api0: Api96_6,
    private val api1: Api124_6,
    private val api2: Api120_6,
    private val api3: Api128_6,
    private val api4: Api144_6,
    private val api5: Api100_6,
    private val api6: Api148_6,
    private val api7: Api108_6,
    private val api8: Api136_6,
    private val api9: Api116_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData() + api9.fetchData()
    }
}