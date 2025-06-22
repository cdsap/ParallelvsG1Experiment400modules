package com.awesomeapp.module_4_384

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_296.Api296_6
import com.awesomeapp.module_3_300.Api300_6
import com.awesomeapp.module_3_304.Api304_6
import com.awesomeapp.module_3_284.Api284_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_316.Api316_6
import com.awesomeapp.module_3_308.Api308_6


@Singleton
class Repository384_5 @Inject constructor(
    private val api0: Api272_6,
    private val api1: Api268_6,
    private val api2: Api296_6,
    private val api3: Api300_6,
    private val api4: Api304_6,
    private val api5: Api284_6,
    private val api6: Api248_6,
    private val api7: Api316_6,
    private val api8: Api308_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData()
    }
}