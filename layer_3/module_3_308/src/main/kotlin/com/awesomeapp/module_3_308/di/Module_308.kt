package com.awesomeapp.module_3_308.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_308.Viewmodel308_1
import com.awesomeapp.module_3_308.Activity308_2
import com.awesomeapp.module_3_308.Activity308_3
import com.awesomeapp.module_3_308.Fragment308_4
import com.awesomeapp.module_3_308.Repository308_5
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_216.Api216_6
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_236.Api236_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_212.Api212_6
import com.awesomeapp.module_2_224.Api224_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_184.Api184_6
import com.awesomeapp.module_3_308.Api308_6
import com.awesomeapp.module_3_308.Model308_8
import com.awesomeapp.module_3_308.Model308_9
import com.awesomeapp.module_3_308.Activity308_10
import com.awesomeapp.module_3_308.Model308_12
import com.awesomeapp.module_3_308.Activity308_13

@Module
@InstallIn(SingletonComponent::class)
object Module_308 {
    @Provides
    @Singleton
    fun provideRepository308_5(
        api0: Api176_6 = Api176_6(),
        api1: Api216_6 = Api216_6(),
        api2: Api204_6 = Api204_6(),
        api3: Api180_6 = Api180_6(),
        api4: Api200_6 = Api200_6(),
        api5: Api208_6 = Api208_6(),
        api6: Api236_6 = Api236_6(),
        api7: Api196_6 = Api196_6(),
        api8: Api212_6 = Api212_6(),
        api9: Api224_6 = Api224_6(),
        api10: Api188_6 = Api188_6(),
        api11: Api192_6 = Api192_6(),
        api12: Api164_6 = Api164_6(),
        api13: Api184_6 = Api184_6()
    ): Repository308_5 {
        return Repository308_5(api0, 
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
    fun provideApi308_6(): Api308_6 {
        return Api308_6()
    }
}