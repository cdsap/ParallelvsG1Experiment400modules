package com.awesomeapp.module_0_76.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_76.Viewmodel76_1
import com.awesomeapp.module_0_76.Activity76_2
import com.awesomeapp.module_0_76.Activity76_3
import com.awesomeapp.module_0_76.Fragment76_4
import com.awesomeapp.module_0_76.Repository76_5
import com.awesomeapp.module_0_76.Api76_6
import com.awesomeapp.module_0_76.Model76_7
import com.awesomeapp.module_0_76.Activity76_8

@Module
@InstallIn(SingletonComponent::class)
object Module_76 {
    @Provides
    @Singleton
    fun provideRepository76_5(): Repository76_5 {
        return Repository76_5()
    }

    @Provides
    @Singleton
    fun provideApi76_6(): Api76_6 {
        return Api76_6()
    }
}