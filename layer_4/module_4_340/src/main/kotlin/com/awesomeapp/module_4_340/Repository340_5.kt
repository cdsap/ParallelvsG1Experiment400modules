package com.awesomeapp.module_4_340

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_248.Api248_6


@Singleton
class Repository340_5 @Inject constructor(
    private val api0: Api248_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData()
    }
}