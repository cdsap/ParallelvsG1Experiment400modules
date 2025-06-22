package com.awesomeapp.module_3_288.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_288.Viewmodel288_1
import com.awesomeapp.module_3_288.Activity288_2
import com.awesomeapp.module_3_288.Activity288_3
import com.awesomeapp.module_3_288.Fragment288_4
import com.awesomeapp.module_3_288.Repository288_5
import com.awesomeapp.module_2_224.Api224_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_240.Api240_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_232.Api232_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_228.Api228_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_3_288.Api288_6
import com.awesomeapp.module_3_288.Usecase288_7
import com.awesomeapp.module_3_288.Model288_9
import com.awesomeapp.module_3_288.Model288_10
import com.awesomeapp.module_3_288.Activity288_11
import com.awesomeapp.module_3_288.Model288_13
import com.awesomeapp.module_3_288.Activity288_14
import com.awesomeapp.module_3_288.Model288_16
import com.awesomeapp.module_3_288.Activity288_17
import com.awesomeapp.module_3_288.Model288_19
import com.awesomeapp.module_3_288.Activity288_20
import com.awesomeapp.module_3_288.Model288_22
import com.awesomeapp.module_3_288.Activity288_23
import com.awesomeapp.module_3_288.Model288_25
import com.awesomeapp.module_3_288.Activity288_26
import com.awesomeapp.module_3_288.Model288_28
import com.awesomeapp.module_3_288.Activity288_29
import com.awesomeapp.module_3_288.Model288_31
import com.awesomeapp.module_3_288.Activity288_32
import com.awesomeapp.module_3_288.Model288_34
import com.awesomeapp.module_3_288.Activity288_35
import com.awesomeapp.module_3_288.Model288_37
import com.awesomeapp.module_3_288.Activity288_38
import com.awesomeapp.module_3_288.Model288_40
import com.awesomeapp.module_3_288.Activity288_41
import com.awesomeapp.module_3_288.Model288_43

@Module
@InstallIn(SingletonComponent::class)
object Module_288 {
    @Provides
    @Singleton
    fun provideRepository288_5(
        api0: Api224_6 = Api224_6(),
        api1: Api164_6 = Api164_6(),
        api2: Api176_6 = Api176_6(),
        api3: Api240_6 = Api240_6(),
        api4: Api196_6 = Api196_6(),
        api5: Api232_6 = Api232_6(),
        api6: Api208_6 = Api208_6(),
        api7: Api180_6 = Api180_6(),
        api8: Api228_6 = Api228_6(),
        api9: Api192_6 = Api192_6()
    ): Repository288_5 {
        return Repository288_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9)
    }

    @Provides
    @Singleton
    fun provideApi288_6(): Api288_6 {
        return Api288_6()
    }
}