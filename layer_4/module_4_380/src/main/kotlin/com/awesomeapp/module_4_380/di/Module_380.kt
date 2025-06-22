package com.awesomeapp.module_4_380.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_380.Viewmodel380_1
import com.awesomeapp.module_4_380.Activity380_2
import com.awesomeapp.module_4_380.Activity380_3
import com.awesomeapp.module_4_380.Fragment380_4
import com.awesomeapp.module_4_380.Repository380_5
import com.awesomeapp.module_3_312.Api312_6
import com.awesomeapp.module_3_300.Api300_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_284.Api284_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_308.Api308_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_316.Api316_6
import com.awesomeapp.module_3_292.Api292_6
import com.awesomeapp.module_3_296.Api296_6
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_288.Api288_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_4_380.Api380_6
import com.awesomeapp.module_4_380.Service380_7
import com.awesomeapp.module_4_380.Worker380_8

@Module
@InstallIn(SingletonComponent::class)
object Module_380 {
    @Provides
    @Singleton
    fun provideRepository380_5(
        api0: Api312_6 = Api312_6(),
        api1: Api300_6 = Api300_6(),
        api2: Api256_6 = Api256_6(),
        api3: Api284_6 = Api284_6(),
        api4: Api260_6 = Api260_6(),
        api5: Api264_6 = Api264_6(),
        api6: Api308_6 = Api308_6(),
        api7: Api252_6 = Api252_6(),
        api8: Api268_6 = Api268_6(),
        api9: Api316_6 = Api316_6(),
        api10: Api292_6 = Api292_6(),
        api11: Api296_6 = Api296_6(),
        api12: Api276_6 = Api276_6(),
        api13: Api288_6 = Api288_6(),
        api14: Api280_6 = Api280_6()
    ): Repository380_5 {
        return Repository380_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10, 
        api11, 
        api12, 
        api13, 
        api14)
    }

    @Provides
    @Singleton
    fun provideApi380_6(): Api380_6 {
        return Api380_6()
    }
}