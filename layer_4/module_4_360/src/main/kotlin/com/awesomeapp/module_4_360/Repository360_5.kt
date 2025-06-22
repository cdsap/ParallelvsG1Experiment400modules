package com.awesomeapp.module_4_360

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_300.Api300_6
import com.awesomeapp.module_3_292.Api292_6


@Singleton
class Repository360_5 @Inject constructor(
    private val api0: Api300_6,
    private val api1: Api292_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData()
    }
}