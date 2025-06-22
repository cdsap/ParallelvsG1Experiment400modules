package com.awesomeapp.module_1_132.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_132.Viewmodel132_1
import com.awesomeapp.module_1_132.Activity132_2
import com.awesomeapp.module_1_132.Activity132_3
import com.awesomeapp.module_1_132.Fragment132_4
import com.awesomeapp.module_1_132.Repository132_5
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_1_132.Api132_6
import com.awesomeapp.module_1_132.Usecase132_7
import com.awesomeapp.module_1_132.Model132_9
import com.awesomeapp.module_1_132.Model132_10
import com.awesomeapp.module_1_132.Activity132_11
import com.awesomeapp.module_1_132.Model132_13
import com.awesomeapp.module_1_132.Activity132_14
import com.awesomeapp.module_1_132.Model132_16

@Module
@InstallIn(SingletonComponent::class)
object Module_132 {
    @Provides
    @Singleton
    fun provideRepository132_5(
        api0: Api60_6 = Api60_6(),
        api1: Api24_6 = Api24_6()
    ): Repository132_5 {
        return Repository132_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi132_6(): Api132_6 {
        return Api132_6()
    }
}