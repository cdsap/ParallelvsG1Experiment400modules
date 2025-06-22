package com.awesomeapp.module_4_360.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_360.Viewmodel360_1
import com.awesomeapp.module_4_360.Activity360_2
import com.awesomeapp.module_4_360.Activity360_3
import com.awesomeapp.module_4_360.Fragment360_4
import com.awesomeapp.module_4_360.Repository360_5
import com.awesomeapp.module_3_300.Api300_6
import com.awesomeapp.module_3_292.Api292_6
import com.awesomeapp.module_4_360.Api360_6
import com.awesomeapp.module_4_360.Service360_7
import com.awesomeapp.module_4_360.Worker360_8
import com.awesomeapp.module_4_360.Usecase360_9
import com.awesomeapp.module_4_360.Model360_11
import com.awesomeapp.module_4_360.Model360_12
import com.awesomeapp.module_4_360.Activity360_13
import com.awesomeapp.module_4_360.Model360_15
import com.awesomeapp.module_4_360.Activity360_16

@Module
@InstallIn(SingletonComponent::class)
object Module_360 {
    @Provides
    @Singleton
    fun provideRepository360_5(
        api0: Api300_6 = Api300_6(),
        api1: Api292_6 = Api292_6()
    ): Repository360_5 {
        return Repository360_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi360_6(): Api360_6 {
        return Api360_6()
    }
}