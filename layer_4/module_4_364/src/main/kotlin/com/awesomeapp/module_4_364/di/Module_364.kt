package com.awesomeapp.module_4_364.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_364.Viewmodel364_1
import com.awesomeapp.module_4_364.Activity364_2
import com.awesomeapp.module_4_364.Activity364_3
import com.awesomeapp.module_4_364.Fragment364_4
import com.awesomeapp.module_4_364.Repository364_5
import com.awesomeapp.module_3_292.Api292_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_304.Api304_6
import com.awesomeapp.module_4_364.Api364_6
import com.awesomeapp.module_4_364.Model364_8
import com.awesomeapp.module_4_364.Activity364_9

@Module
@InstallIn(SingletonComponent::class)
object Module_364 {
    @Provides
    @Singleton
    fun provideRepository364_5(
        api0: Api292_6 = Api292_6(),
        api1: Api272_6 = Api272_6(),
        api2: Api248_6 = Api248_6(),
        api3: Api260_6 = Api260_6(),
        api4: Api268_6 = Api268_6(),
        api5: Api304_6 = Api304_6()
    ): Repository364_5 {
        return Repository364_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi364_6(): Api364_6 {
        return Api364_6()
    }
}