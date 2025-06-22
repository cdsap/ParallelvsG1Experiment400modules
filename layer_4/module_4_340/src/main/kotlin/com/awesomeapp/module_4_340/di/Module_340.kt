package com.awesomeapp.module_4_340.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_340.Viewmodel340_1
import com.awesomeapp.module_4_340.Activity340_2
import com.awesomeapp.module_4_340.Activity340_3
import com.awesomeapp.module_4_340.Fragment340_4
import com.awesomeapp.module_4_340.Repository340_5
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_4_340.Api340_6
import com.awesomeapp.module_4_340.Service340_7
import com.awesomeapp.module_4_340.Worker340_8
import com.awesomeapp.module_4_340.Model340_10
import com.awesomeapp.module_4_340.Model340_11
import com.awesomeapp.module_4_340.Activity340_12
import com.awesomeapp.module_4_340.Model340_14
import com.awesomeapp.module_4_340.Activity340_15
import com.awesomeapp.module_4_340.Model340_17
import com.awesomeapp.module_4_340.Activity340_18
import com.awesomeapp.module_4_340.Model340_20
import com.awesomeapp.module_4_340.Activity340_21
import com.awesomeapp.module_4_340.Model340_23
import com.awesomeapp.module_4_340.Activity340_24
import com.awesomeapp.module_4_340.Model340_26
import com.awesomeapp.module_4_340.Activity340_27
import com.awesomeapp.module_4_340.Model340_29
import com.awesomeapp.module_4_340.Activity340_30

@Module
@InstallIn(SingletonComponent::class)
object Module_340 {
    @Provides
    @Singleton
    fun provideRepository340_5(
        api0: Api248_6 = Api248_6()
    ): Repository340_5 {
        return Repository340_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi340_6(): Api340_6 {
        return Api340_6()
    }
}