package com.awesomeapp.module_2_180.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_180.Viewmodel180_1
import com.awesomeapp.module_2_180.Activity180_2
import com.awesomeapp.module_2_180.Activity180_3
import com.awesomeapp.module_2_180.Fragment180_4
import com.awesomeapp.module_2_180.Repository180_5
import com.awesomeapp.module_1_112.Api112_6
import com.awesomeapp.module_1_132.Api132_6
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_152.Api152_6
import com.awesomeapp.module_1_160.Api160_6
import com.awesomeapp.module_1_148.Api148_6
import com.awesomeapp.module_1_156.Api156_6
import com.awesomeapp.module_1_120.Api120_6
import com.awesomeapp.module_1_96.Api96_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_136.Api136_6
import com.awesomeapp.module_1_108.Api108_6
import com.awesomeapp.module_2_180.Api180_6

@Module
@InstallIn(SingletonComponent::class)
object Module_180 {
    @Provides
    @Singleton
    fun provideRepository180_5(
        api0: Api112_6 = Api112_6(),
        api1: Api132_6 = Api132_6(),
        api2: Api124_6 = Api124_6(),
        api3: Api152_6 = Api152_6(),
        api4: Api160_6 = Api160_6(),
        api5: Api148_6 = Api148_6(),
        api6: Api156_6 = Api156_6(),
        api7: Api120_6 = Api120_6(),
        api8: Api96_6 = Api96_6(),
        api9: Api88_6 = Api88_6(),
        api10: Api136_6 = Api136_6(),
        api11: Api108_6 = Api108_6()
    ): Repository180_5 {
        return Repository180_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10, 
        api11)
    }

    @Provides
    @Singleton
    fun provideApi180_6(): Api180_6 {
        return Api180_6()
    }
}