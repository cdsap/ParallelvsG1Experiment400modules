package com.awesomeapp.module_3_260

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_232.Api232_6


@Singleton
class Repository260_5 @Inject constructor(
    private val api0: Api232_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData()
    }
}