package com.awesomeapp.module_4_368

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_288.Api288_6
import com.awesomeapp.module_3_312.Api312_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_308.Api308_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_300.Api300_6
import com.awesomeapp.module_3_304.Api304_6


@Singleton
class Repository368_5 @Inject constructor(
    private val api0: Api272_6,
    private val api1: Api276_6,
    private val api2: Api244_6,
    private val api3: Api264_6,
    private val api4: Api288_6,
    private val api5: Api312_6,
    private val api6: Api248_6,
    private val api7: Api280_6,
    private val api8: Api308_6,
    private val api9: Api260_6,
    private val api10: Api256_6,
    private val api11: Api252_6,
    private val api12: Api300_6,
    private val api13: Api304_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData() + api9.fetchData() + api10.fetchData() + api11.fetchData() + api12.fetchData() + api13.fetchData()
    }
}