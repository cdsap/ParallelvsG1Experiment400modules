package com.awesomeapp.module_1_96.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_96.Viewmodel96_1
import com.awesomeapp.module_1_96.Activity96_2
import com.awesomeapp.module_1_96.Activity96_3
import com.awesomeapp.module_1_96.Fragment96_4
import com.awesomeapp.module_1_96.Repository96_5
import com.awesomeapp.module_1_96.Api96_6
import com.awesomeapp.module_1_96.Usecase96_7
import com.awesomeapp.module_1_96.Model96_9
import com.awesomeapp.module_1_96.Model96_10
import com.awesomeapp.module_1_96.Activity96_11

@Module
@InstallIn(SingletonComponent::class)
object Module_96 {
    @Provides
    @Singleton
    fun provideRepository96_5(): Repository96_5 {
        return Repository96_5()
    }

    @Provides
    @Singleton
    fun provideApi96_6(): Api96_6 {
        return Api96_6()
    }
}