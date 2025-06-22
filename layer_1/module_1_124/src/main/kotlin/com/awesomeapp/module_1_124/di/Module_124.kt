package com.awesomeapp.module_1_124.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_124.Viewmodel124_1
import com.awesomeapp.module_1_124.Activity124_2
import com.awesomeapp.module_1_124.Activity124_3
import com.awesomeapp.module_1_124.Fragment124_4
import com.awesomeapp.module_1_124.Repository124_5
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_124.Model124_8
import com.awesomeapp.module_1_124.Model124_9
import com.awesomeapp.module_1_124.Activity124_10
import com.awesomeapp.module_1_124.Model124_12
import com.awesomeapp.module_1_124.Activity124_13
import com.awesomeapp.module_1_124.Model124_15
import com.awesomeapp.module_1_124.Activity124_16
import com.awesomeapp.module_1_124.Model124_18
import com.awesomeapp.module_1_124.Activity124_19
import com.awesomeapp.module_1_124.Model124_21

@Module
@InstallIn(SingletonComponent::class)
object Module_124 {
    @Provides
    @Singleton
    fun provideRepository124_5(): Repository124_5 {
        return Repository124_5()
    }

    @Provides
    @Singleton
    fun provideApi124_6(): Api124_6 {
        return Api124_6()
    }
}