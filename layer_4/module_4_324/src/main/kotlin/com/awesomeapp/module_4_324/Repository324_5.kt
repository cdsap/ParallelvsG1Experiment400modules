package com.awesomeapp.module_4_324

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_284.Api284_6


@Singleton
class Repository324_5 @Inject constructor(
    private val api0: Api260_6,
    private val api1: Api284_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData()
    }
}