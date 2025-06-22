package com.awesomeapp.module_0_60.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_60.Viewmodel60_1
import com.awesomeapp.module_0_60.Activity60_2
import com.awesomeapp.module_0_60.Activity60_3
import com.awesomeapp.module_0_60.Fragment60_4
import com.awesomeapp.module_0_60.Repository60_5
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_60.Service60_7
import com.awesomeapp.module_0_60.Worker60_8
import com.awesomeapp.module_0_60.Usecase60_9

@Module
@InstallIn(SingletonComponent::class)
object Module_60 {
    @Provides
    @Singleton
    fun provideRepository60_5(): Repository60_5 {
        return Repository60_5()
    }

    @Provides
    @Singleton
    fun provideApi60_6(): Api60_6 {
        return Api60_6()
    }
}