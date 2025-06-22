package com.awesomeapp.module_2_240.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_240.Viewmodel240_1
import com.awesomeapp.module_2_240.Activity240_2
import com.awesomeapp.module_2_240.Activity240_3
import com.awesomeapp.module_2_240.Fragment240_4
import com.awesomeapp.module_2_240.Repository240_5
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_132.Api132_6
import com.awesomeapp.module_2_240.Api240_6
import com.awesomeapp.module_2_240.Service240_7
import com.awesomeapp.module_2_240.Worker240_8
import com.awesomeapp.module_2_240.Usecase240_9
import com.awesomeapp.module_2_240.Model240_11
import com.awesomeapp.module_2_240.Model240_12
import com.awesomeapp.module_2_240.Activity240_13
import com.awesomeapp.module_2_240.Model240_15
import com.awesomeapp.module_2_240.Activity240_16
import com.awesomeapp.module_2_240.Model240_18
import com.awesomeapp.module_2_240.Activity240_19
import com.awesomeapp.module_2_240.Model240_21
import com.awesomeapp.module_2_240.Activity240_22
import com.awesomeapp.module_2_240.Model240_24
import com.awesomeapp.module_2_240.Activity240_25
import com.awesomeapp.module_2_240.Model240_27
import com.awesomeapp.module_2_240.Activity240_28
import com.awesomeapp.module_2_240.Model240_30
import com.awesomeapp.module_2_240.Activity240_31

@Module
@InstallIn(SingletonComponent::class)
object Module_240 {
    @Provides
    @Singleton
    fun provideRepository240_5(
        api0: Api88_6 = Api88_6(),
        api1: Api124_6 = Api124_6(),
        api2: Api132_6 = Api132_6()
    ): Repository240_5 {
        return Repository240_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi240_6(): Api240_6 {
        return Api240_6()
    }
}