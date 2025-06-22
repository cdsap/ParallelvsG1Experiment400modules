package com.awesomeapp.module_4_364

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_292.Api292_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_304.Api304_6


@Singleton
class Repository364_5 @Inject constructor(
    private val api0: Api292_6,
    private val api1: Api272_6,
    private val api2: Api248_6,
    private val api3: Api260_6,
    private val api4: Api268_6,
    private val api5: Api304_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData()
    }
}