package com.awesomeapp.module_2_236.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_236.Viewmodel236_1
import com.awesomeapp.module_2_236.Activity236_2
import com.awesomeapp.module_2_236.Activity236_3
import com.awesomeapp.module_2_236.Fragment236_4
import com.awesomeapp.module_2_236.Repository236_5
import com.awesomeapp.module_1_96.Api96_6
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_120.Api120_6
import com.awesomeapp.module_1_128.Api128_6
import com.awesomeapp.module_1_144.Api144_6
import com.awesomeapp.module_1_100.Api100_6
import com.awesomeapp.module_1_148.Api148_6
import com.awesomeapp.module_1_108.Api108_6
import com.awesomeapp.module_1_136.Api136_6
import com.awesomeapp.module_1_116.Api116_6
import com.awesomeapp.module_2_236.Api236_6
import com.awesomeapp.module_2_236.Model236_8
import com.awesomeapp.module_2_236.Model236_9
import com.awesomeapp.module_2_236.Activity236_10

@Module
@InstallIn(SingletonComponent::class)
object Module_236 {
    @Provides
    @Singleton
    fun provideRepository236_5(
        api0: Api96_6 = Api96_6(),
        api1: Api124_6 = Api124_6(),
        api2: Api120_6 = Api120_6(),
        api3: Api128_6 = Api128_6(),
        api4: Api144_6 = Api144_6(),
        api5: Api100_6 = Api100_6(),
        api6: Api148_6 = Api148_6(),
        api7: Api108_6 = Api108_6(),
        api8: Api136_6 = Api136_6(),
        api9: Api116_6 = Api116_6()
    ): Repository236_5 {
        return Repository236_5(api0, 
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
    fun provideApi236_6(): Api236_6 {
        return Api236_6()
    }
}