package com.awesomeapp.module_4_392.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_392.Viewmodel392_1
import com.awesomeapp.module_4_392.Activity392_2
import com.awesomeapp.module_4_392.Activity392_3
import com.awesomeapp.module_4_392.Fragment392_4
import com.awesomeapp.module_4_392.Repository392_5
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_296.Api296_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_316.Api316_6
import com.awesomeapp.module_3_308.Api308_6
import com.awesomeapp.module_3_288.Api288_6
import com.awesomeapp.module_3_284.Api284_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_292.Api292_6
import com.awesomeapp.module_3_320.Api320_6
import com.awesomeapp.module_4_392.Api392_6
import com.awesomeapp.module_4_392.Model392_8
import com.awesomeapp.module_4_392.Model392_9
import com.awesomeapp.module_4_392.Activity392_10
import com.awesomeapp.module_4_392.Model392_12
import com.awesomeapp.module_4_392.Activity392_13
import com.awesomeapp.module_4_392.Model392_15
import com.awesomeapp.module_4_392.Activity392_16
import com.awesomeapp.module_4_392.Model392_18
import com.awesomeapp.module_4_392.Activity392_19

@Module
@InstallIn(SingletonComponent::class)
object Module_392 {
    @Provides
    @Singleton
    fun provideRepository392_5(
        api0: Api272_6 = Api272_6(),
        api1: Api296_6 = Api296_6(),
        api2: Api256_6 = Api256_6(),
        api3: Api316_6 = Api316_6(),
        api4: Api308_6 = Api308_6(),
        api5: Api288_6 = Api288_6(),
        api6: Api284_6 = Api284_6(),
        api7: Api252_6 = Api252_6(),
        api8: Api280_6 = Api280_6(),
        api9: Api292_6 = Api292_6(),
        api10: Api320_6 = Api320_6()
    ): Repository392_5 {
        return Repository392_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10)
    }

    @Provides
    @Singleton
    fun provideApi392_6(): Api392_6 {
        return Api392_6()
    }
}