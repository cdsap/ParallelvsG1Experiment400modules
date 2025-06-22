package com.awesomeapp.module_2_220.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_220.Viewmodel220_1
import com.awesomeapp.module_2_220.Activity220_2
import com.awesomeapp.module_2_220.Activity220_3
import com.awesomeapp.module_2_220.Fragment220_4
import com.awesomeapp.module_2_220.Repository220_5
import com.awesomeapp.module_1_108.Api108_6
import com.awesomeapp.module_2_220.Api220_6
import com.awesomeapp.module_2_220.Service220_7
import com.awesomeapp.module_2_220.Worker220_8
import com.awesomeapp.module_2_220.Model220_10
import com.awesomeapp.module_2_220.Model220_11
import com.awesomeapp.module_2_220.Activity220_12
import com.awesomeapp.module_2_220.Model220_14
import com.awesomeapp.module_2_220.Activity220_15
import com.awesomeapp.module_2_220.Model220_17
import com.awesomeapp.module_2_220.Activity220_18
import com.awesomeapp.module_2_220.Model220_20
import com.awesomeapp.module_2_220.Activity220_21
import com.awesomeapp.module_2_220.Model220_23
import com.awesomeapp.module_2_220.Activity220_24
import com.awesomeapp.module_2_220.Model220_26
import com.awesomeapp.module_2_220.Activity220_27
import com.awesomeapp.module_2_220.Model220_29
import com.awesomeapp.module_2_220.Activity220_30
import com.awesomeapp.module_2_220.Model220_32
import com.awesomeapp.module_2_220.Activity220_33

@Module
@InstallIn(SingletonComponent::class)
object Module_220 {
    @Provides
    @Singleton
    fun provideRepository220_5(
        api0: Api108_6 = Api108_6()
    ): Repository220_5 {
        return Repository220_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi220_6(): Api220_6 {
        return Api220_6()
    }
}