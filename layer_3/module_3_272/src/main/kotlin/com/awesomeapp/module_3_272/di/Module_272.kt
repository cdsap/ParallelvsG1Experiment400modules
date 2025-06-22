package com.awesomeapp.module_3_272.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_272.Viewmodel272_1
import com.awesomeapp.module_3_272.Activity272_2
import com.awesomeapp.module_3_272.Activity272_3
import com.awesomeapp.module_3_272.Fragment272_4
import com.awesomeapp.module_3_272.Repository272_5
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_240.Api240_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_216.Api216_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_168.Api168_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_212.Api212_6
import com.awesomeapp.module_2_228.Api228_6
import com.awesomeapp.module_2_224.Api224_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_2_220.Api220_6
import com.awesomeapp.module_2_236.Api236_6
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_272.Model272_8
import com.awesomeapp.module_3_272.Model272_9
import com.awesomeapp.module_3_272.Activity272_10
import com.awesomeapp.module_3_272.Model272_12
import com.awesomeapp.module_3_272.Activity272_13
import com.awesomeapp.module_3_272.Model272_15
import com.awesomeapp.module_3_272.Activity272_16
import com.awesomeapp.module_3_272.Model272_18
import com.awesomeapp.module_3_272.Activity272_19
import com.awesomeapp.module_3_272.Model272_21
import com.awesomeapp.module_3_272.Activity272_22
import com.awesomeapp.module_3_272.Model272_24
import com.awesomeapp.module_3_272.Activity272_25

@Module
@InstallIn(SingletonComponent::class)
object Module_272 {
    @Provides
    @Singleton
    fun provideRepository272_5(
        api0: Api192_6 = Api192_6(),
        api1: Api240_6 = Api240_6(),
        api2: Api180_6 = Api180_6(),
        api3: Api216_6 = Api216_6(),
        api4: Api208_6 = Api208_6(),
        api5: Api168_6 = Api168_6(),
        api6: Api196_6 = Api196_6(),
        api7: Api212_6 = Api212_6(),
        api8: Api228_6 = Api228_6(),
        api9: Api224_6 = Api224_6(),
        api10: Api172_6 = Api172_6(),
        api11: Api204_6 = Api204_6(),
        api12: Api220_6 = Api220_6(),
        api13: Api236_6 = Api236_6(),
        api14: Api176_6 = Api176_6(),
        api15: Api164_6 = Api164_6(),
        api16: Api188_6 = Api188_6()
    ): Repository272_5 {
        return Repository272_5(api0, 
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
    fun provideApi272_6(): Api272_6 {
        return Api272_6()
    }
}