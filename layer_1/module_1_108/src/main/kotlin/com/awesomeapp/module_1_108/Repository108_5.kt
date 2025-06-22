package com.awesomeapp.module_1_108

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_44.Api44_6
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_0_60.Api60_6


@Singleton
class Repository108_5 @Inject constructor(
    private val api0: Api4_6,
    private val api1: Api44_6,
    private val api2: Api20_6,
    private val api3: Api60_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData()
    }
}