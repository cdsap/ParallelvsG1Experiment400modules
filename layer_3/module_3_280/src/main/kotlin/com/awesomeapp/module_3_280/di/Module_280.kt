package com.awesomeapp.module_3_280.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_280.Viewmodel280_1
import com.awesomeapp.module_3_280.Activity280_2
import com.awesomeapp.module_3_280.Activity280_3
import com.awesomeapp.module_3_280.Fragment280_4
import com.awesomeapp.module_3_280.Repository280_5
import com.awesomeapp.module_2_232.Api232_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_2_240.Api240_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_184.Api184_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_2_168.Api168_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_228.Api228_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_280.Service280_7
import com.awesomeapp.module_3_280.Worker280_8
import com.awesomeapp.module_3_280.Model280_10
import com.awesomeapp.module_3_280.Model280_11
import com.awesomeapp.module_3_280.Activity280_12
import com.awesomeapp.module_3_280.Model280_14
import com.awesomeapp.module_3_280.Activity280_15
import com.awesomeapp.module_3_280.Model280_17
import com.awesomeapp.module_3_280.Activity280_18
import com.awesomeapp.module_3_280.Model280_20
import com.awesomeapp.module_3_280.Activity280_21
import com.awesomeapp.module_3_280.Model280_23
import com.awesomeapp.module_3_280.Activity280_24
import com.awesomeapp.module_3_280.Model280_26
import com.awesomeapp.module_3_280.Activity280_27
import com.awesomeapp.module_3_280.Model280_29
import com.awesomeapp.module_3_280.Activity280_30
import com.awesomeapp.module_3_280.Model280_32
import com.awesomeapp.module_3_280.Activity280_33
import com.awesomeapp.module_3_280.Model280_35
import com.awesomeapp.module_3_280.Activity280_36
import com.awesomeapp.module_3_280.Model280_38
import com.awesomeapp.module_3_280.Activity280_39
import com.awesomeapp.module_3_280.Model280_41
import com.awesomeapp.module_3_280.Activity280_42
import com.awesomeapp.module_3_280.Model280_44
import com.awesomeapp.module_3_280.Activity280_45
import com.awesomeapp.module_3_280.Model280_47
import com.awesomeapp.module_3_280.Activity280_48

@Module
@InstallIn(SingletonComponent::class)
object Module_280 {
    @Provides
    @Singleton
    fun provideRepository280_5(
        api0: Api232_6 = Api232_6(),
        api1: Api208_6 = Api208_6(),
        api2: Api204_6 = Api204_6(),
        api3: Api188_6 = Api188_6(),
        api4: Api240_6 = Api240_6(),
        api5: Api180_6 = Api180_6(),
        api6: Api184_6 = Api184_6(),
        api7: Api172_6 = Api172_6(),
        api8: Api168_6 = Api168_6(),
        api9: Api192_6 = Api192_6(),
        api10: Api228_6 = Api228_6()
    ): Repository280_5 {
        return Repository280_5(api0, 
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
    fun provideApi280_6(): Api280_6 {
        return Api280_6()
    }
}