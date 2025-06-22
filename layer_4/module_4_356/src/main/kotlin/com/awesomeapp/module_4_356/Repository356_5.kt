package com.awesomeapp.module_4_356

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_288.Api288_6


@Singleton
class Repository356_5 @Inject constructor(
    private val api0: Api288_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData()
    }
}