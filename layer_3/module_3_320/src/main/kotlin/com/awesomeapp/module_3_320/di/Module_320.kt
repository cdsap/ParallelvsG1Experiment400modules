package com.awesomeapp.module_3_320.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_320.Viewmodel320_1
import com.awesomeapp.module_3_320.Activity320_2
import com.awesomeapp.module_3_320.Activity320_3
import com.awesomeapp.module_3_320.Fragment320_4
import com.awesomeapp.module_3_320.Repository320_5
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
import com.awesomeapp.module_3_320.Api320_6
import com.awesomeapp.module_3_320.Service320_7
import com.awesomeapp.module_3_320.Worker320_8
import com.awesomeapp.module_3_320.Model320_10
import com.awesomeapp.module_3_320.Model320_11
import com.awesomeapp.module_3_320.Activity320_12
import com.awesomeapp.module_3_320.Model320_14
import com.awesomeapp.module_3_320.Activity320_15
import com.awesomeapp.module_3_320.Model320_17
import com.awesomeapp.module_3_320.Activity320_18
import com.awesomeapp.module_3_320.Model320_20
import com.awesomeapp.module_3_320.Activity320_21
import com.awesomeapp.module_3_320.Model320_23
import com.awesomeapp.module_3_320.Activity320_24

@Module
@InstallIn(SingletonComponent::class)
object Module_320 {
    @Provides
    @Singleton
    fun provideRepository320_5(
        api0: Api208_6 = Api208_6(),
        api1: Api228_6 = Api228_6(),
        api2: Api192_6 = Api192_6(),
        api3: Api196_6 = Api196_6(),
        api4: Api200_6 = Api200_6(),
        api5: Api220_6 = Api220_6(),
        api6: Api236_6 = Api236_6(),
        api7: Api188_6 = Api188_6(),
        api8: Api184_6 = Api184_6(),
        api9: Api212_6 = Api212_6(),
        api10: Api180_6 = Api180_6()
    ): Repository320_5 {
        return Repository320_5(api0, 
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
    fun provideApi320_6(): Api320_6 {
        return Api320_6()
    }
}