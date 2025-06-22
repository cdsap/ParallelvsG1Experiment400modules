package com.awesomeapp.module_4_400.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_400.Viewmodel400_1
import com.awesomeapp.module_4_400.Activity400_2
import com.awesomeapp.module_4_400.Activity400_3
import com.awesomeapp.module_4_400.Fragment400_4
import com.awesomeapp.module_4_400.Repository400_5
import com.awesomeapp.module_3_316.Api316_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_296.Api296_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_284.Api284_6
import com.awesomeapp.module_3_308.Api308_6
import com.awesomeapp.module_3_288.Api288_6
import com.awesomeapp.module_3_304.Api304_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_312.Api312_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_4_400.Api400_6
import com.awesomeapp.module_4_400.Service400_7
import com.awesomeapp.module_4_400.Worker400_8
import com.awesomeapp.module_4_400.Model400_9

@Module
@InstallIn(SingletonComponent::class)
object Module_400 {
    @Provides
    @Singleton
    fun provideRepository400_5(
        api0: Api316_6 = Api316_6(),
        api1: Api256_6 = Api256_6(),
        api2: Api296_6 = Api296_6(),
        api3: Api268_6 = Api268_6(),
        api4: Api284_6 = Api284_6(),
        api5: Api308_6 = Api308_6(),
        api6: Api288_6 = Api288_6(),
        api7: Api304_6 = Api304_6(),
        api8: Api264_6 = Api264_6(),
        api9: Api276_6 = Api276_6(),
        api10: Api272_6 = Api272_6(),
        api11: Api312_6 = Api312_6(),
        api12: Api280_6 = Api280_6(),
        api13: Api248_6 = Api248_6()
    ): Repository400_5 {
        return Repository400_5(api0, 
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
        api13)
    }

    @Provides
    @Singleton
    fun provideApi400_6(): Api400_6 {
        return Api400_6()
    }
}