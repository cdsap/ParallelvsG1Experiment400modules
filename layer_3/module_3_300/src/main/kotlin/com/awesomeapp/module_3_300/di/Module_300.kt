package com.awesomeapp.module_3_300.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_300.Viewmodel300_1
import com.awesomeapp.module_3_300.Activity300_2
import com.awesomeapp.module_3_300.Activity300_3
import com.awesomeapp.module_3_300.Fragment300_4
import com.awesomeapp.module_3_300.Repository300_5
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_2_216.Api216_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_212.Api212_6
import com.awesomeapp.module_2_232.Api232_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_2_240.Api240_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_220.Api220_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_224.Api224_6
import com.awesomeapp.module_2_228.Api228_6
import com.awesomeapp.module_3_300.Api300_6
import com.awesomeapp.module_3_300.Service300_7
import com.awesomeapp.module_3_300.Worker300_8
import com.awesomeapp.module_3_300.Usecase300_9
import com.awesomeapp.module_3_300.Model300_11
import com.awesomeapp.module_3_300.Model300_12
import com.awesomeapp.module_3_300.Activity300_13
import com.awesomeapp.module_3_300.Model300_15
import com.awesomeapp.module_3_300.Activity300_16
import com.awesomeapp.module_3_300.Model300_18
import com.awesomeapp.module_3_300.Activity300_19
import com.awesomeapp.module_3_300.Model300_21
import com.awesomeapp.module_3_300.Activity300_22
import com.awesomeapp.module_3_300.Model300_24
import com.awesomeapp.module_3_300.Activity300_25
import com.awesomeapp.module_3_300.Model300_27
import com.awesomeapp.module_3_300.Activity300_28
import com.awesomeapp.module_3_300.Model300_30
import com.awesomeapp.module_3_300.Activity300_31
import com.awesomeapp.module_3_300.Model300_33
import com.awesomeapp.module_3_300.Activity300_34
import com.awesomeapp.module_3_300.Model300_36
import com.awesomeapp.module_3_300.Activity300_37

@Module
@InstallIn(SingletonComponent::class)
object Module_300 {
    @Provides
    @Singleton
    fun provideRepository300_5(
        api0: Api196_6 = Api196_6(),
        api1: Api204_6 = Api204_6(),
        api2: Api216_6 = Api216_6(),
        api3: Api208_6 = Api208_6(),
        api4: Api180_6 = Api180_6(),
        api5: Api172_6 = Api172_6(),
        api6: Api176_6 = Api176_6(),
        api7: Api212_6 = Api212_6(),
        api8: Api232_6 = Api232_6(),
        api9: Api188_6 = Api188_6(),
        api10: Api240_6 = Api240_6(),
        api11: Api164_6 = Api164_6(),
        api12: Api200_6 = Api200_6(),
        api13: Api220_6 = Api220_6(),
        api14: Api192_6 = Api192_6(),
        api15: Api224_6 = Api224_6(),
        api16: Api228_6 = Api228_6()
    ): Repository300_5 {
        return Repository300_5(api0, 
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
        api16)
    }

    @Provides
    @Singleton
    fun provideApi300_6(): Api300_6 {
        return Api300_6()
    }
}