package com.awesomeapp.module_2_240

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_132.Api132_6


@Singleton
class Repository240_5 @Inject constructor(
    private val api0: Api88_6,
    private val api1: Api124_6,
    private val api2: Api132_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData()
    }
}