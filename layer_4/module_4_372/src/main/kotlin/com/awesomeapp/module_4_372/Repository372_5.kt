package com.awesomeapp.module_4_372

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_288.Api288_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_284.Api284_6
import com.awesomeapp.module_3_300.Api300_6


@Singleton
class Repository372_5 @Inject constructor(
    private val api0: Api288_6,
    private val api1: Api252_6,
    private val api2: Api256_6,
    private val api3: Api284_6,
    private val api4: Api300_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData()
    }
}