package com.awesomeapp.module_3_320

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_228.Api228_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_220.Api220_6
import com.awesomeapp.module_2_236.Api236_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_2_184.Api184_6
import com.awesomeapp.module_2_212.Api212_6
import com.awesomeapp.module_2_180.Api180_6


@Singleton
class Repository320_5 @Inject constructor(
    private val api0: Api208_6,
    private val api1: Api228_6,
    private val api2: Api192_6,
    private val api3: Api196_6,
    private val api4: Api200_6,
    private val api5: Api220_6,
    private val api6: Api236_6,
    private val api7: Api188_6,
    private val api8: Api184_6,
    private val api9: Api212_6,
    private val api10: Api180_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData() + api9.fetchData() + api10.fetchData()
    }
}