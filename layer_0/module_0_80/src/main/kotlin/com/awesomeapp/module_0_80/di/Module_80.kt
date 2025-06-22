package com.awesomeapp.module_0_80.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_80.Viewmodel80_1
import com.awesomeapp.module_0_80.Activity80_2
import com.awesomeapp.module_0_80.Activity80_3
import com.awesomeapp.module_0_80.Fragment80_4
import com.awesomeapp.module_0_80.Repository80_5
import com.awesomeapp.module_0_80.Api80_6
import com.awesomeapp.module_0_80.Service80_7
import com.awesomeapp.module_0_80.Worker80_8
import com.awesomeapp.module_0_80.Model80_10
import com.awesomeapp.module_0_80.Model80_11
import com.awesomeapp.module_0_80.Activity80_12
import com.awesomeapp.module_0_80.Model80_14
import com.awesomeapp.module_0_80.Activity80_15
import com.awesomeapp.module_0_80.Model80_17
import com.awesomeapp.module_0_80.Activity80_18
import com.awesomeapp.module_0_80.Model80_20
import com.awesomeapp.module_0_80.Activity80_21
import com.awesomeapp.module_0_80.Model80_23
import com.awesomeapp.module_0_80.Activity80_24
import com.awesomeapp.module_0_80.Model80_26
import com.awesomeapp.module_0_80.Activity80_27
import com.awesomeapp.module_0_80.Model80_29
import com.awesomeapp.module_0_80.Activity80_30
import com.awesomeapp.module_0_80.Model80_32
import com.awesomeapp.module_0_80.Activity80_33
import com.awesomeapp.module_0_80.Model80_35
import com.awesomeapp.module_0_80.Activity80_36

@Module
@InstallIn(SingletonComponent::class)
object Module_80 {
    @Provides
    @Singleton
    fun provideRepository80_5(): Repository80_5 {
        return Repository80_5()
    }

    @Provides
    @Singleton
    fun provideApi80_6(): Api80_6 {
        return Api80_6()
    }
}