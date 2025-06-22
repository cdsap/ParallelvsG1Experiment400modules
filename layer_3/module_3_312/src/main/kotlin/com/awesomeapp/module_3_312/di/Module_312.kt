package com.awesomeapp.module_3_312.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_312.Viewmodel312_1
import com.awesomeapp.module_3_312.Activity312_2
import com.awesomeapp.module_3_312.Activity312_3
import com.awesomeapp.module_3_312.Fragment312_4
import com.awesomeapp.module_3_312.Repository312_5
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_3_312.Api312_6
import com.awesomeapp.module_3_312.Usecase312_7
import com.awesomeapp.module_3_312.Model312_9
import com.awesomeapp.module_3_312.Model312_10
import com.awesomeapp.module_3_312.Activity312_11
import com.awesomeapp.module_3_312.Model312_13
import com.awesomeapp.module_3_312.Activity312_14
import com.awesomeapp.module_3_312.Model312_16
import com.awesomeapp.module_3_312.Activity312_17
import com.awesomeapp.module_3_312.Model312_19
import com.awesomeapp.module_3_312.Activity312_20
import com.awesomeapp.module_3_312.Model312_22
import com.awesomeapp.module_3_312.Activity312_23
import com.awesomeapp.module_3_312.Model312_25
import com.awesomeapp.module_3_312.Activity312_26
import com.awesomeapp.module_3_312.Model312_28
import com.awesomeapp.module_3_312.Activity312_29
import com.awesomeapp.module_3_312.Model312_31
import com.awesomeapp.module_3_312.Activity312_32
import com.awesomeapp.module_3_312.Model312_34
import com.awesomeapp.module_3_312.Activity312_35
import com.awesomeapp.module_3_312.Model312_37

@Module
@InstallIn(SingletonComponent::class)
object Module_312 {
    @Provides
    @Singleton
    fun provideRepository312_5(
        api0: Api204_6 = Api204_6()
    ): Repository312_5 {
        return Repository312_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi312_6(): Api312_6 {
        return Api312_6()
    }
}