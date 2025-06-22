package com.awesomeapp.module_3_292.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_292.Viewmodel292_1
import com.awesomeapp.module_3_292.Activity292_2
import com.awesomeapp.module_3_292.Activity292_3
import com.awesomeapp.module_3_292.Fragment292_4
import com.awesomeapp.module_3_292.Repository292_5
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_236.Api236_6
import com.awesomeapp.module_2_240.Api240_6
import com.awesomeapp.module_2_216.Api216_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_220.Api220_6
import com.awesomeapp.module_3_292.Api292_6
import com.awesomeapp.module_3_292.Model292_8
import com.awesomeapp.module_3_292.Model292_9
import com.awesomeapp.module_3_292.Activity292_10
import com.awesomeapp.module_3_292.Model292_12
import com.awesomeapp.module_3_292.Activity292_13
import com.awesomeapp.module_3_292.Model292_15
import com.awesomeapp.module_3_292.Activity292_16
import com.awesomeapp.module_3_292.Model292_18
import com.awesomeapp.module_3_292.Activity292_19

@Module
@InstallIn(SingletonComponent::class)
object Module_292 {
    @Provides
    @Singleton
    fun provideRepository292_5(
        api0: Api208_6 = Api208_6(),
        api1: Api236_6 = Api236_6(),
        api2: Api240_6 = Api240_6(),
        api3: Api216_6 = Api216_6(),
        api4: Api196_6 = Api196_6(),
        api5: Api180_6 = Api180_6(),
        api6: Api220_6 = Api220_6()
    ): Repository292_5 {
        return Repository292_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi292_6(): Api292_6 {
        return Api292_6()
    }
}