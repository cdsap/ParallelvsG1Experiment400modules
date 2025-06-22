package com.awesomeapp.module_1_144.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_144.Viewmodel144_1
import com.awesomeapp.module_1_144.Activity144_2
import com.awesomeapp.module_1_144.Activity144_3
import com.awesomeapp.module_1_144.Fragment144_4
import com.awesomeapp.module_1_144.Repository144_5
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_12.Api12_6
import com.awesomeapp.module_0_72.Api72_6
import com.awesomeapp.module_0_52.Api52_6
import com.awesomeapp.module_0_76.Api76_6
import com.awesomeapp.module_0_44.Api44_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_16.Api16_6
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_28.Api28_6
import com.awesomeapp.module_0_64.Api64_6
import com.awesomeapp.module_1_144.Api144_6
import com.awesomeapp.module_1_144.Usecase144_7
import com.awesomeapp.module_1_144.Model144_8
import com.awesomeapp.module_1_144.Activity144_9

@Module
@InstallIn(SingletonComponent::class)
object Module_144 {
    @Provides
    @Singleton
    fun provideRepository144_5(
        api0: Api60_6 = Api60_6(),
        api1: Api12_6 = Api12_6(),
        api2: Api72_6 = Api72_6(),
        api3: Api52_6 = Api52_6(),
        api4: Api76_6 = Api76_6(),
        api5: Api44_6 = Api44_6(),
        api6: Api24_6 = Api24_6(),
        api7: Api16_6 = Api16_6(),
        api8: Api32_6 = Api32_6(),
        api9: Api28_6 = Api28_6(),
        api10: Api64_6 = Api64_6()
    ): Repository144_5 {
        return Repository144_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10)
    }

    @Provides
    @Singleton
    fun provideApi144_6(): Api144_6 {
        return Api144_6()
    }
}