package com.awesomeapp.module_1_112.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_112.Viewmodel112_1
import com.awesomeapp.module_1_112.Activity112_2
import com.awesomeapp.module_1_112.Activity112_3
import com.awesomeapp.module_1_112.Fragment112_4
import com.awesomeapp.module_1_112.Repository112_5
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_76.Api76_6
import com.awesomeapp.module_0_36.Api36_6
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_12.Api12_6
import com.awesomeapp.module_1_112.Api112_6
import com.awesomeapp.module_1_112.Model112_8
import com.awesomeapp.module_1_112.Model112_9
import com.awesomeapp.module_1_112.Activity112_10
import com.awesomeapp.module_1_112.Model112_12
import com.awesomeapp.module_1_112.Activity112_13
import com.awesomeapp.module_1_112.Model112_15
import com.awesomeapp.module_1_112.Activity112_16
import com.awesomeapp.module_1_112.Model112_18
import com.awesomeapp.module_1_112.Activity112_19
import com.awesomeapp.module_1_112.Model112_21
import com.awesomeapp.module_1_112.Activity112_22
import com.awesomeapp.module_1_112.Model112_24
import com.awesomeapp.module_1_112.Activity112_25
import com.awesomeapp.module_1_112.Model112_27
import com.awesomeapp.module_1_112.Activity112_28
import com.awesomeapp.module_1_112.Model112_30
import com.awesomeapp.module_1_112.Activity112_31
import com.awesomeapp.module_1_112.Model112_33
import com.awesomeapp.module_1_112.Activity112_34
import com.awesomeapp.module_1_112.Model112_36

@Module
@InstallIn(SingletonComponent::class)
object Module_112 {
    @Provides
    @Singleton
    fun provideRepository112_5(
        api0: Api24_6 = Api24_6(),
        api1: Api76_6 = Api76_6(),
        api2: Api36_6 = Api36_6(),
        api3: Api60_6 = Api60_6(),
        api4: Api12_6 = Api12_6()
    ): Repository112_5 {
        return Repository112_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi112_6(): Api112_6 {
        return Api112_6()
    }
}