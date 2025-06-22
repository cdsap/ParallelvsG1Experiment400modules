package com.awesomeapp.module_4_388.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_388.Viewmodel388_1
import com.awesomeapp.module_4_388.Activity388_2
import com.awesomeapp.module_4_388.Activity388_3
import com.awesomeapp.module_4_388.Fragment388_4
import com.awesomeapp.module_4_388.Repository388_5
import com.awesomeapp.module_3_288.Api288_6
import com.awesomeapp.module_3_304.Api304_6
import com.awesomeapp.module_3_316.Api316_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_292.Api292_6
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_296.Api296_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_320.Api320_6
import com.awesomeapp.module_4_388.Api388_6
import com.awesomeapp.module_4_388.Model388_8
import com.awesomeapp.module_4_388.Model388_9
import com.awesomeapp.module_4_388.Activity388_10
import com.awesomeapp.module_4_388.Model388_12
import com.awesomeapp.module_4_388.Activity388_13
import com.awesomeapp.module_4_388.Model388_15
import com.awesomeapp.module_4_388.Activity388_16
import com.awesomeapp.module_4_388.Model388_18
import com.awesomeapp.module_4_388.Activity388_19
import com.awesomeapp.module_4_388.Model388_21
import com.awesomeapp.module_4_388.Activity388_22
import com.awesomeapp.module_4_388.Model388_24
import com.awesomeapp.module_4_388.Activity388_25
import com.awesomeapp.module_4_388.Model388_27
import com.awesomeapp.module_4_388.Activity388_28
import com.awesomeapp.module_4_388.Model388_30
import com.awesomeapp.module_4_388.Activity388_31
import com.awesomeapp.module_4_388.Model388_33
import com.awesomeapp.module_4_388.Activity388_34

@Module
@InstallIn(SingletonComponent::class)
object Module_388 {
    @Provides
    @Singleton
    fun provideRepository388_5(
        api0: Api288_6 = Api288_6(),
        api1: Api304_6 = Api304_6(),
        api2: Api316_6 = Api316_6(),
        api3: Api252_6 = Api252_6(),
        api4: Api292_6 = Api292_6(),
        api5: Api276_6 = Api276_6(),
        api6: Api296_6 = Api296_6(),
        api7: Api260_6 = Api260_6(),
        api8: Api320_6 = Api320_6()
    ): Repository388_5 {
        return Repository388_5(api0, 
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
    fun provideApi388_6(): Api388_6 {
        return Api388_6()
    }
}