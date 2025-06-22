package com.awesomeapp.module_1_132

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_24.Api24_6


@Singleton
class Repository132_5 @Inject constructor(
    private val api0: Api60_6,
    private val api1: Api24_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData()
    }
}