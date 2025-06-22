package com.awesomeapp.module_3_244

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_224.Api224_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_236.Api236_6
import com.awesomeapp.module_2_216.Api216_6
import com.awesomeapp.module_2_232.Api232_6
import com.awesomeapp.module_2_168.Api168_6


@Singleton
class Repository244_5 @Inject constructor(
    private val api0: Api224_6,
    private val api1: Api192_6,
    private val api2: Api164_6,
    private val api3: Api208_6,
    private val api4: Api236_6,
    private val api5: Api216_6,
    private val api6: Api232_6,
    private val api7: Api168_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData()
    }
}