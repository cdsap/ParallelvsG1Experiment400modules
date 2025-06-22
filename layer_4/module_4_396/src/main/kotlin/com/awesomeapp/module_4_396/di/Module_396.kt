package com.awesomeapp.module_4_396.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_396.Viewmodel396_1
import com.awesomeapp.module_4_396.Activity396_2
import com.awesomeapp.module_4_396.Activity396_3
import com.awesomeapp.module_4_396.Fragment396_4
import com.awesomeapp.module_4_396.Repository396_5
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_312.Api312_6
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_3_308.Api308_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_316.Api316_6
import com.awesomeapp.module_3_296.Api296_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_292.Api292_6
import com.awesomeapp.module_3_300.Api300_6
import com.awesomeapp.module_3_304.Api304_6
import com.awesomeapp.module_3_320.Api320_6
import com.awesomeapp.module_3_288.Api288_6
import com.awesomeapp.module_3_284.Api284_6
import com.awesomeapp.module_4_396.Api396_6

@Module
@InstallIn(SingletonComponent::class)
object Module_396 {
    @Provides
    @Singleton
    fun provideRepository396_5(
        api0: Api264_6 = Api264_6(),
        api1: Api312_6 = Api312_6(),
        api2: Api244_6 = Api244_6(),
        api3: Api308_6 = Api308_6(),
        api4: Api260_6 = Api260_6(),
        api5: Api268_6 = Api268_6(),
        api6: Api248_6 = Api248_6(),
        api7: Api256_6 = Api256_6(),
        api8: Api276_6 = Api276_6(),
        api9: Api316_6 = Api316_6(),
        api10: Api296_6 = Api296_6(),
        api11: Api280_6 = Api280_6(),
        api12: Api252_6 = Api252_6(),
        api13: Api292_6 = Api292_6(),
        api14: Api300_6 = Api300_6(),
        api15: Api304_6 = Api304_6(),
        api16: Api320_6 = Api320_6(),
        api17: Api288_6 = Api288_6(),
        api18: Api284_6 = Api284_6()
    ): Repository396_5 {
        return Repository396_5(api0, 
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
        api14, 
        api15, 
        api16, 
        api17, 
        api18)
    }

    @Provides
    @Singleton
    fun provideApi396_6(): Api396_6 {
        return Api396_6()
    }
}