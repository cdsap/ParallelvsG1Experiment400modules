package com.awesomeapp.module_3_276

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_224.Api224_6


@Singleton
class Repository276_5 @Inject constructor(
    private val api0: Api224_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData()
    }
}