package com.awesomeapp.module_0_28.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_28.Viewmodel28_1
import com.awesomeapp.module_0_28.Activity28_2
import com.awesomeapp.module_0_28.Activity28_3
import com.awesomeapp.module_0_28.Fragment28_4
import com.awesomeapp.module_0_28.Repository28_5
import com.awesomeapp.module_0_28.Api28_6
import com.awesomeapp.module_0_28.Model28_7

@Module
@InstallIn(SingletonComponent::class)
object Module_28 {
    @Provides
    @Singleton
    fun provideRepository28_5(): Repository28_5 {
        return Repository28_5()
    }

    @Provides
    @Singleton
    fun provideApi28_6(): Api28_6 {
        return Api28_6()
    }
}