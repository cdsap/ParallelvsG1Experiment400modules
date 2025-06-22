package com.awesomeapp.module_4_384.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_384.Viewmodel384_1
import com.awesomeapp.module_4_384.Activity384_2
import com.awesomeapp.module_4_384.Activity384_3
import com.awesomeapp.module_4_384.Fragment384_4
import com.awesomeapp.module_4_384.Repository384_5
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_296.Api296_6
import com.awesomeapp.module_3_300.Api300_6
import com.awesomeapp.module_3_304.Api304_6
import com.awesomeapp.module_3_284.Api284_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_316.Api316_6
import com.awesomeapp.module_3_308.Api308_6
import com.awesomeapp.module_4_384.Api384_6
import com.awesomeapp.module_4_384.Model384_7

@Module
@InstallIn(SingletonComponent::class)
object Module_384 {
    @Provides
    @Singleton
    fun provideRepository384_5(
        api0: Api272_6 = Api272_6(),
        api1: Api268_6 = Api268_6(),
        api2: Api296_6 = Api296_6(),
        api3: Api300_6 = Api300_6(),
        api4: Api304_6 = Api304_6(),
        api5: Api284_6 = Api284_6(),
        api6: Api248_6 = Api248_6(),
        api7: Api316_6 = Api316_6(),
        api8: Api308_6 = Api308_6()
    ): Repository384_5 {
        return Repository384_5(api0, 
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
    fun provideApi384_6(): Api384_6 {
        return Api384_6()
    }
}