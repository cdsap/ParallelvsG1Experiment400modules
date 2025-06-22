package com.awesomeapp.module_3_312

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_204.Api204_6


@Singleton
class Repository312_5 @Inject constructor(
    private val api0: Api204_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData()
    }
}