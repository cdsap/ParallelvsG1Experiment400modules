package com.awesomeapp.module_1_156.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_156.Viewmodel156_1
import com.awesomeapp.module_1_156.Activity156_2
import com.awesomeapp.module_1_156.Activity156_3
import com.awesomeapp.module_1_156.Fragment156_4
import com.awesomeapp.module_1_156.Repository156_5
import com.awesomeapp.module_0_76.Api76_6
import com.awesomeapp.module_0_56.Api56_6
import com.awesomeapp.module_0_16.Api16_6
import com.awesomeapp.module_0_40.Api40_6
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_48.Api48_6
import com.awesomeapp.module_1_156.Api156_6
import com.awesomeapp.module_1_156.Usecase156_7
import com.awesomeapp.module_1_156.Model156_9
import com.awesomeapp.module_1_156.Model156_10
import com.awesomeapp.module_1_156.Activity156_11
import com.awesomeapp.module_1_156.Model156_13
import com.awesomeapp.module_1_156.Activity156_14
import com.awesomeapp.module_1_156.Model156_16
import com.awesomeapp.module_1_156.Activity156_17
import com.awesomeapp.module_1_156.Model156_19
import com.awesomeapp.module_1_156.Activity156_20
import com.awesomeapp.module_1_156.Model156_22
import com.awesomeapp.module_1_156.Activity156_23
import com.awesomeapp.module_1_156.Model156_25

@Module
@InstallIn(SingletonComponent::class)
object Module_156 {
    @Provides
    @Singleton
    fun provideRepository156_5(
        api0: Api76_6 = Api76_6(),
        api1: Api56_6 = Api56_6(),
        api2: Api16_6 = Api16_6(),
        api3: Api40_6 = Api40_6(),
        api4: Api60_6 = Api60_6(),
        api5: Api48_6 = Api48_6()
    ): Repository156_5 {
        return Repository156_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi156_6(): Api156_6 {
        return Api156_6()
    }
}