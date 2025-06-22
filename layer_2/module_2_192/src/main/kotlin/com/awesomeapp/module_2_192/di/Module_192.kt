package com.awesomeapp.module_2_192.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_192.Viewmodel192_1
import com.awesomeapp.module_2_192.Activity192_2
import com.awesomeapp.module_2_192.Activity192_3
import com.awesomeapp.module_2_192.Fragment192_4
import com.awesomeapp.module_2_192.Repository192_5
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_192.Usecase192_7
import com.awesomeapp.module_2_192.Model192_9
import com.awesomeapp.module_2_192.Model192_10
import com.awesomeapp.module_2_192.Activity192_11
import com.awesomeapp.module_2_192.Model192_13
import com.awesomeapp.module_2_192.Activity192_14
import com.awesomeapp.module_2_192.Model192_16
import com.awesomeapp.module_2_192.Activity192_17
import com.awesomeapp.module_2_192.Model192_19
import com.awesomeapp.module_2_192.Activity192_20
import com.awesomeapp.module_2_192.Model192_22

@Module
@InstallIn(SingletonComponent::class)
object Module_192 {
    @Provides
    @Singleton
    fun provideRepository192_5(): Repository192_5 {
        return Repository192_5()
    }

    @Provides
    @Singleton
    fun provideApi192_6(): Api192_6 {
        return Api192_6()
    }
}