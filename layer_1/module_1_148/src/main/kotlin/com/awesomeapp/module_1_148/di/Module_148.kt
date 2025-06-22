package com.awesomeapp.module_1_148.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_148.Viewmodel148_1
import com.awesomeapp.module_1_148.Activity148_2
import com.awesomeapp.module_1_148.Activity148_3
import com.awesomeapp.module_1_148.Fragment148_4
import com.awesomeapp.module_1_148.Repository148_5
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_0_48.Api48_6
import com.awesomeapp.module_0_16.Api16_6
import com.awesomeapp.module_0_36.Api36_6
import com.awesomeapp.module_0_56.Api56_6
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_80.Api80_6
import com.awesomeapp.module_0_40.Api40_6
import com.awesomeapp.module_0_68.Api68_6
import com.awesomeapp.module_1_148.Api148_6
import com.awesomeapp.module_1_148.Model148_8
import com.awesomeapp.module_1_148.Model148_9
import com.awesomeapp.module_1_148.Activity148_10
import com.awesomeapp.module_1_148.Model148_12
import com.awesomeapp.module_1_148.Activity148_13
import com.awesomeapp.module_1_148.Model148_15
import com.awesomeapp.module_1_148.Activity148_16
import com.awesomeapp.module_1_148.Model148_18
import com.awesomeapp.module_1_148.Activity148_19
import com.awesomeapp.module_1_148.Model148_21
import com.awesomeapp.module_1_148.Activity148_22
import com.awesomeapp.module_1_148.Model148_24
import com.awesomeapp.module_1_148.Activity148_25
import com.awesomeapp.module_1_148.Model148_27
import com.awesomeapp.module_1_148.Activity148_28
import com.awesomeapp.module_1_148.Model148_30
import com.awesomeapp.module_1_148.Activity148_31
import com.awesomeapp.module_1_148.Model148_33
import com.awesomeapp.module_1_148.Activity148_34
import com.awesomeapp.module_1_148.Model148_36
import com.awesomeapp.module_1_148.Activity148_37
import com.awesomeapp.module_1_148.Model148_39
import com.awesomeapp.module_1_148.Activity148_40
import com.awesomeapp.module_1_148.Model148_42
import com.awesomeapp.module_1_148.Activity148_43
import com.awesomeapp.module_1_148.Model148_45
import com.awesomeapp.module_1_148.Activity148_46

@Module
@InstallIn(SingletonComponent::class)
object Module_148 {
    @Provides
    @Singleton
    fun provideRepository148_5(
        api0: Api8_6 = Api8_6(),
        api1: Api48_6 = Api48_6(),
        api2: Api16_6 = Api16_6(),
        api3: Api36_6 = Api36_6(),
        api4: Api56_6 = Api56_6(),
        api5: Api60_6 = Api60_6(),
        api6: Api80_6 = Api80_6(),
        api7: Api40_6 = Api40_6(),
        api8: Api68_6 = Api68_6()
    ): Repository148_5 {
        return Repository148_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi148_6(): Api148_6 {
        return Api148_6()
    }
}