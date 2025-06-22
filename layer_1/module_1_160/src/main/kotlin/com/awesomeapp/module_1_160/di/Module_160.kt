package com.awesomeapp.module_1_160.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_160.Viewmodel160_1
import com.awesomeapp.module_1_160.Activity160_2
import com.awesomeapp.module_1_160.Activity160_3
import com.awesomeapp.module_1_160.Fragment160_4
import com.awesomeapp.module_1_160.Repository160_5
import com.awesomeapp.module_0_56.Api56_6
import com.awesomeapp.module_0_76.Api76_6
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_52.Api52_6
import com.awesomeapp.module_1_160.Api160_6
import com.awesomeapp.module_1_160.Service160_7
import com.awesomeapp.module_1_160.Worker160_8
import com.awesomeapp.module_1_160.Model160_10
import com.awesomeapp.module_1_160.Model160_11
import com.awesomeapp.module_1_160.Activity160_12
import com.awesomeapp.module_1_160.Model160_14
import com.awesomeapp.module_1_160.Activity160_15
import com.awesomeapp.module_1_160.Model160_17
import com.awesomeapp.module_1_160.Activity160_18
import com.awesomeapp.module_1_160.Model160_20
import com.awesomeapp.module_1_160.Activity160_21
import com.awesomeapp.module_1_160.Model160_23
import com.awesomeapp.module_1_160.Activity160_24
import com.awesomeapp.module_1_160.Model160_26
import com.awesomeapp.module_1_160.Activity160_27

@Module
@InstallIn(SingletonComponent::class)
object Module_160 {
    @Provides
    @Singleton
    fun provideRepository160_5(
        api0: Api56_6 = Api56_6(),
        api1: Api76_6 = Api76_6(),
        api2: Api20_6 = Api20_6(),
        api3: Api4_6 = Api4_6(),
        api4: Api52_6 = Api52_6()
    ): Repository160_5 {
        return Repository160_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi160_6(): Api160_6 {
        return Api160_6()
    }
}