package com.awesomeapp.module_4_372.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_372.Viewmodel372_1
import com.awesomeapp.module_4_372.Activity372_2
import com.awesomeapp.module_4_372.Activity372_3
import com.awesomeapp.module_4_372.Fragment372_4
import com.awesomeapp.module_4_372.Repository372_5
import com.awesomeapp.module_3_288.Api288_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_284.Api284_6
import com.awesomeapp.module_3_300.Api300_6
import com.awesomeapp.module_4_372.Api372_6
import com.awesomeapp.module_4_372.Usecase372_7
import com.awesomeapp.module_4_372.Model372_9
import com.awesomeapp.module_4_372.Model372_10
import com.awesomeapp.module_4_372.Activity372_11
import com.awesomeapp.module_4_372.Model372_13
import com.awesomeapp.module_4_372.Activity372_14
import com.awesomeapp.module_4_372.Model372_16
import com.awesomeapp.module_4_372.Activity372_17
import com.awesomeapp.module_4_372.Model372_19
import com.awesomeapp.module_4_372.Activity372_20
import com.awesomeapp.module_4_372.Model372_22
import com.awesomeapp.module_4_372.Activity372_23
import com.awesomeapp.module_4_372.Model372_25
import com.awesomeapp.module_4_372.Activity372_26
import com.awesomeapp.module_4_372.Model372_28
import com.awesomeapp.module_4_372.Activity372_29
import com.awesomeapp.module_4_372.Model372_31
import com.awesomeapp.module_4_372.Activity372_32
import com.awesomeapp.module_4_372.Model372_34
import com.awesomeapp.module_4_372.Activity372_35
import com.awesomeapp.module_4_372.Model372_37

@Module
@InstallIn(SingletonComponent::class)
object Module_372 {
    @Provides
    @Singleton
    fun provideRepository372_5(
        api0: Api288_6 = Api288_6(),
        api1: Api252_6 = Api252_6(),
        api2: Api256_6 = Api256_6(),
        api3: Api284_6 = Api284_6(),
        api4: Api300_6 = Api300_6()
    ): Repository372_5 {
        return Repository372_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi372_6(): Api372_6 {
        return Api372_6()
    }
}