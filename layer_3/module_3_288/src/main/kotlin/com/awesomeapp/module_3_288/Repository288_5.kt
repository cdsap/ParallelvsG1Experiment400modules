package com.awesomeapp.module_3_288

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_224.Api224_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_240.Api240_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_232.Api232_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_228.Api228_6
import com.awesomeapp.module_2_192.Api192_6


@Singleton
class Repository288_5 @Inject constructor(
    private val api0: Api224_6,
    private val api1: Api164_6,
    private val api2: Api176_6,
    private val api3: Api240_6,
    private val api4: Api196_6,
    private val api5: Api232_6,
    private val api6: Api208_6,
    private val api7: Api180_6,
    private val api8: Api228_6,
    private val api9: Api192_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData() + api9.fetchData()
    }
}