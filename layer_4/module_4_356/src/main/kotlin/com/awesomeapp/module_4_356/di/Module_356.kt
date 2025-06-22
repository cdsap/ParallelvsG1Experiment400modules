package com.awesomeapp.module_4_356.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_356.Viewmodel356_1
import com.awesomeapp.module_4_356.Activity356_2
import com.awesomeapp.module_4_356.Activity356_3
import com.awesomeapp.module_4_356.Fragment356_4
import com.awesomeapp.module_4_356.Repository356_5
import com.awesomeapp.module_3_288.Api288_6
import com.awesomeapp.module_4_356.Api356_6
import com.awesomeapp.module_4_356.Model356_8
import com.awesomeapp.module_4_356.Model356_9
import com.awesomeapp.module_4_356.Activity356_10
import com.awesomeapp.module_4_356.Model356_12
import com.awesomeapp.module_4_356.Activity356_13
import com.awesomeapp.module_4_356.Model356_15
import com.awesomeapp.module_4_356.Activity356_16
import com.awesomeapp.module_4_356.Model356_18
import com.awesomeapp.module_4_356.Activity356_19
import com.awesomeapp.module_4_356.Model356_21
import com.awesomeapp.module_4_356.Activity356_22
import com.awesomeapp.module_4_356.Model356_24
import com.awesomeapp.module_4_356.Activity356_25
import com.awesomeapp.module_4_356.Model356_27
import com.awesomeapp.module_4_356.Activity356_28

@Module
@InstallIn(SingletonComponent::class)
object Module_356 {
    @Provides
    @Singleton
    fun provideRepository356_5(
        api0: Api288_6 = Api288_6()
    ): Repository356_5 {
        return Repository356_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi356_6(): Api356_6 {
        return Api356_6()
    }
}