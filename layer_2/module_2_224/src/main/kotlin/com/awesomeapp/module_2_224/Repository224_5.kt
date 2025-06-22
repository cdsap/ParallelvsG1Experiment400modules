package com.awesomeapp.module_2_224

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_128.Api128_6
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_104.Api104_6
import com.awesomeapp.module_1_144.Api144_6
import com.awesomeapp.module_1_96.Api96_6
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_152.Api152_6
import com.awesomeapp.module_1_112.Api112_6


@Singleton
class Repository224_5 @Inject constructor(
    private val api0: Api128_6,
    private val api1: Api92_6,
    private val api2: Api104_6,
    private val api3: Api144_6,
    private val api4: Api96_6,
    private val api5: Api124_6,
    private val api6: Api152_6,
    private val api7: Api112_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData()
    }
}