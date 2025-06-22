package com.awesomeapp.module_4_324.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_324.Viewmodel324_1
import com.awesomeapp.module_4_324.Activity324_2
import com.awesomeapp.module_4_324.Activity324_3
import com.awesomeapp.module_4_324.Fragment324_4
import com.awesomeapp.module_4_324.Repository324_5
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_284.Api284_6
import com.awesomeapp.module_4_324.Api324_6
import com.awesomeapp.module_4_324.Usecase324_7
import com.awesomeapp.module_4_324.Model324_9
import com.awesomeapp.module_4_324.Model324_10
import com.awesomeapp.module_4_324.Activity324_11
import com.awesomeapp.module_4_324.Model324_13
import com.awesomeapp.module_4_324.Activity324_14
import com.awesomeapp.module_4_324.Model324_16
import com.awesomeapp.module_4_324.Activity324_17
import com.awesomeapp.module_4_324.Model324_19
import com.awesomeapp.module_4_324.Activity324_20
import com.awesomeapp.module_4_324.Model324_22
import com.awesomeapp.module_4_324.Activity324_23
import com.awesomeapp.module_4_324.Model324_25
import com.awesomeapp.module_4_324.Activity324_26
import com.awesomeapp.module_4_324.Model324_28
import com.awesomeapp.module_4_324.Activity324_29
import com.awesomeapp.module_4_324.Model324_31
import com.awesomeapp.module_4_324.Activity324_32
import com.awesomeapp.module_4_324.Model324_34
import com.awesomeapp.module_4_324.Activity324_35
import com.awesomeapp.module_4_324.Model324_37
import com.awesomeapp.module_4_324.Activity324_38

@Module
@InstallIn(SingletonComponent::class)
object Module_324 {
    @Provides
    @Singleton
    fun provideRepository324_5(
        api0: Api260_6 = Api260_6(),
        api1: Api284_6 = Api284_6()
    ): Repository324_5 {
        return Repository324_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi324_6(): Api324_6 {
        return Api324_6()
    }
}