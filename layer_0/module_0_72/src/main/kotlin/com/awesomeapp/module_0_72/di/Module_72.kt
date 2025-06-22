package com.awesomeapp.module_0_72.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_72.Viewmodel72_1
import com.awesomeapp.module_0_72.Activity72_2
import com.awesomeapp.module_0_72.Activity72_3
import com.awesomeapp.module_0_72.Fragment72_4
import com.awesomeapp.module_0_72.Repository72_5
import com.awesomeapp.module_0_72.Api72_6
import com.awesomeapp.module_0_72.Usecase72_7
import com.awesomeapp.module_0_72.Model72_9
import com.awesomeapp.module_0_72.Model72_10
import com.awesomeapp.module_0_72.Activity72_11

@Module
@InstallIn(SingletonComponent::class)
object Module_72 {
    @Provides
    @Singleton
    fun provideRepository72_5(): Repository72_5 {
        return Repository72_5()
    }

    @Provides
    @Singleton
    fun provideApi72_6(): Api72_6 {
        return Api72_6()
    }
}