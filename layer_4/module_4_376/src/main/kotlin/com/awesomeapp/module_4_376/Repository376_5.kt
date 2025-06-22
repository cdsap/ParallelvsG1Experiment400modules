package com.awesomeapp.module_4_376

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_296.Api296_6


@Singleton
class Repository376_5 @Inject constructor(
    private val api0: Api256_6,
    private val api1: Api296_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData()
    }
}