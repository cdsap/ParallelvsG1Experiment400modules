package com.awesomeapp.module_3_304

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_212.Api212_6
import com.awesomeapp.module_2_236.Api236_6
import com.awesomeapp.module_2_216.Api216_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_2_184.Api184_6
import com.awesomeapp.module_2_204.Api204_6


@Singleton
class Repository304_5 @Inject constructor(
    private val api0: Api212_6,
    private val api1: Api236_6,
    private val api2: Api216_6,
    private val api3: Api164_6,
    private val api4: Api172_6,
    private val api5: Api184_6,
    private val api6: Api204_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData()
    }
}