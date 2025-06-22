package com.awesomeapp.module_4_344

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_308.Api308_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_300.Api300_6
import com.awesomeapp.module_3_304.Api304_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_3_296.Api296_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_320.Api320_6
import com.awesomeapp.module_3_264.Api264_6


@Singleton
class Repository344_5 @Inject constructor(
    private val api0: Api308_6,
    private val api1: Api268_6,
    private val api2: Api300_6,
    private val api3: Api304_6,
    private val api4: Api280_6,
    private val api5: Api244_6,
    private val api6: Api296_6,
    private val api7: Api256_6,
    private val api8: Api320_6,
    private val api9: Api264_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData() + api9.fetchData()
    }
}