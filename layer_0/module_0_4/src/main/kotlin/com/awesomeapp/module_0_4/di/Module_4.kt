package com.awesomeapp.module_0_4.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_4.Viewmodel4_1
import com.awesomeapp.module_0_4.Activity4_2
import com.awesomeapp.module_0_4.Activity4_3
import com.awesomeapp.module_0_4.Fragment4_4
import com.awesomeapp.module_0_4.Repository4_5
import com.awesomeapp.module_0_4.Api4_6

@Module
@InstallIn(SingletonComponent::class)
object Module_4 {
    @Provides
    @Singleton
    fun provideRepository4_5(): Repository4_5 {
        return Repository4_5()
    }

    @Provides
    @Singleton
    fun provideApi4_6(): Api4_6 {
        return Api4_6()
    }
}