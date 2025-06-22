package com.awesomeapp.module_0_64.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_64.Viewmodel64_1
import com.awesomeapp.module_0_64.Activity64_2
import com.awesomeapp.module_0_64.Activity64_3
import com.awesomeapp.module_0_64.Fragment64_4
import com.awesomeapp.module_0_64.Repository64_5
import com.awesomeapp.module_0_64.Api64_6
import com.awesomeapp.module_0_64.Model64_7
import com.awesomeapp.module_0_64.Activity64_8

@Module
@InstallIn(SingletonComponent::class)
object Module_64 {
    @Provides
    @Singleton
    fun provideRepository64_5(): Repository64_5 {
        return Repository64_5()
    }

    @Provides
    @Singleton
    fun provideApi64_6(): Api64_6 {
        return Api64_6()
    }
}