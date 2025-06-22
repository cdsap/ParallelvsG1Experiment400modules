package com.awesomeapp.module_4_336.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_336.Viewmodel336_1
import com.awesomeapp.module_4_336.Activity336_2
import com.awesomeapp.module_4_336.Activity336_3
import com.awesomeapp.module_4_336.Fragment336_4
import com.awesomeapp.module_4_336.Repository336_5
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_304.Api304_6
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_3_308.Api308_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_292.Api292_6
import com.awesomeapp.module_3_316.Api316_6
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_296.Api296_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_320.Api320_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_4_336.Api336_6
import com.awesomeapp.module_4_336.Usecase336_7
import com.awesomeapp.module_4_336.Model336_9
import com.awesomeapp.module_4_336.Model336_10
import com.awesomeapp.module_4_336.Activity336_11
import com.awesomeapp.module_4_336.Model336_13
import com.awesomeapp.module_4_336.Activity336_14
import com.awesomeapp.module_4_336.Model336_16
import com.awesomeapp.module_4_336.Activity336_17
import com.awesomeapp.module_4_336.Model336_19
import com.awesomeapp.module_4_336.Activity336_20
import com.awesomeapp.module_4_336.Model336_22
import com.awesomeapp.module_4_336.Activity336_23
import com.awesomeapp.module_4_336.Model336_25
import com.awesomeapp.module_4_336.Activity336_26
import com.awesomeapp.module_4_336.Model336_28
import com.awesomeapp.module_4_336.Activity336_29
import com.awesomeapp.module_4_336.Model336_31
import com.awesomeapp.module_4_336.Activity336_32
import com.awesomeapp.module_4_336.Model336_34
import com.awesomeapp.module_4_336.Activity336_35
import com.awesomeapp.module_4_336.Model336_37
import com.awesomeapp.module_4_336.Activity336_38
import com.awesomeapp.module_4_336.Model336_40
import com.awesomeapp.module_4_336.Activity336_41
import com.awesomeapp.module_4_336.Model336_43
import com.awesomeapp.module_4_336.Activity336_44

@Module
@InstallIn(SingletonComponent::class)
object Module_336 {
    @Provides
    @Singleton
    fun provideRepository336_5(
        api0: Api280_6 = Api280_6(),
        api1: Api304_6 = Api304_6(),
        api2: Api244_6 = Api244_6(),
        api3: Api308_6 = Api308_6(),
        api4: Api256_6 = Api256_6(),
        api5: Api292_6 = Api292_6(),
        api6: Api316_6 = Api316_6(),
        api7: Api276_6 = Api276_6(),
        api8: Api272_6 = Api272_6(),
        api9: Api296_6 = Api296_6(),
        api10: Api252_6 = Api252_6(),
        api11: Api320_6 = Api320_6(),
        api12: Api264_6 = Api264_6()
    ): Repository336_5 {
        return Repository336_5(api0, 
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
        api12)
    }

    @Provides
    @Singleton
    fun provideApi336_6(): Api336_6 {
        return Api336_6()
    }
}