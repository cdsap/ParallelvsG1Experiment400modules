package com.awesomeapp.module_1_112

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_76.Api76_6
import com.awesomeapp.module_0_36.Api36_6
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_12.Api12_6


@Singleton
class Repository112_5 @Inject constructor(
    private val api0: Api24_6,
    private val api1: Api76_6,
    private val api2: Api36_6,
    private val api3: Api60_6,
    private val api4: Api12_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData()
    }
}