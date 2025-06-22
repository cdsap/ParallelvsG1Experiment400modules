package com.awesomeapp.module_4_352.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_352.Viewmodel352_1
import com.awesomeapp.module_4_352.Activity352_2
import com.awesomeapp.module_4_352.Activity352_3
import com.awesomeapp.module_4_352.Fragment352_4
import com.awesomeapp.module_4_352.Repository352_5
import com.awesomeapp.module_3_312.Api312_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_316.Api316_6
import com.awesomeapp.module_3_308.Api308_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_304.Api304_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_288.Api288_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_296.Api296_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_4_352.Api352_6
import com.awesomeapp.module_4_352.Model352_8
import com.awesomeapp.module_4_352.Model352_9
import com.awesomeapp.module_4_352.Activity352_10
import com.awesomeapp.module_4_352.Model352_12
import com.awesomeapp.module_4_352.Activity352_13
import com.awesomeapp.module_4_352.Model352_15
import com.awesomeapp.module_4_352.Activity352_16
import com.awesomeapp.module_4_352.Model352_18
import com.awesomeapp.module_4_352.Activity352_19
import com.awesomeapp.module_4_352.Model352_21
import com.awesomeapp.module_4_352.Activity352_22
import com.awesomeapp.module_4_352.Model352_24
import com.awesomeapp.module_4_352.Activity352_25
import com.awesomeapp.module_4_352.Model352_27
import com.awesomeapp.module_4_352.Activity352_28
import com.awesomeapp.module_4_352.Model352_30
import com.awesomeapp.module_4_352.Activity352_31
import com.awesomeapp.module_4_352.Model352_33
import com.awesomeapp.module_4_352.Activity352_34
import com.awesomeapp.module_4_352.Model352_36
import com.awesomeapp.module_4_352.Activity352_37

@Module
@InstallIn(SingletonComponent::class)
object Module_352 {
    @Provides
    @Singleton
    fun provideRepository352_5(
        api0: Api312_6 = Api312_6(),
        api1: Api272_6 = Api272_6(),
        api2: Api248_6 = Api248_6(),
        api3: Api316_6 = Api316_6(),
        api4: Api308_6 = Api308_6(),
        api5: Api280_6 = Api280_6(),
        api6: Api304_6 = Api304_6(),
        api7: Api268_6 = Api268_6(),
        api8: Api260_6 = Api260_6(),
        api9: Api288_6 = Api288_6(),
        api10: Api256_6 = Api256_6(),
        api11: Api296_6 = Api296_6(),
        api12: Api252_6 = Api252_6(),
        api13: Api244_6 = Api244_6()
    ): Repository352_5 {
        return Repository352_5(api0, 
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
        api11, 
        api12, 
        api13)
    }

    @Provides
    @Singleton
    fun provideApi352_6(): Api352_6 {
        return Api352_6()
    }
}