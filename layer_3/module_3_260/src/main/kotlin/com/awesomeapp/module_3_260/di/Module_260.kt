package com.awesomeapp.module_3_260.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_260.Viewmodel260_1
import com.awesomeapp.module_3_260.Activity260_2
import com.awesomeapp.module_3_260.Activity260_3
import com.awesomeapp.module_3_260.Fragment260_4
import com.awesomeapp.module_3_260.Repository260_5
import com.awesomeapp.module_2_232.Api232_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_260.Service260_7
import com.awesomeapp.module_3_260.Worker260_8
import com.awesomeapp.module_3_260.Model260_10
import com.awesomeapp.module_3_260.Model260_11
import com.awesomeapp.module_3_260.Activity260_12
import com.awesomeapp.module_3_260.Model260_14
import com.awesomeapp.module_3_260.Activity260_15
import com.awesomeapp.module_3_260.Model260_17
import com.awesomeapp.module_3_260.Activity260_18
import com.awesomeapp.module_3_260.Model260_20
import com.awesomeapp.module_3_260.Activity260_21
import com.awesomeapp.module_3_260.Model260_23
import com.awesomeapp.module_3_260.Activity260_24
import com.awesomeapp.module_3_260.Model260_26
import com.awesomeapp.module_3_260.Activity260_27
import com.awesomeapp.module_3_260.Model260_29
import com.awesomeapp.module_3_260.Activity260_30
import com.awesomeapp.module_3_260.Model260_32
import com.awesomeapp.module_3_260.Activity260_33
import com.awesomeapp.module_3_260.Model260_35
import com.awesomeapp.module_3_260.Activity260_36
import com.awesomeapp.module_3_260.Model260_38
import com.awesomeapp.module_3_260.Activity260_39
import com.awesomeapp.module_3_260.Model260_41
import com.awesomeapp.module_3_260.Activity260_42
import com.awesomeapp.module_3_260.Model260_44
import com.awesomeapp.module_3_260.Activity260_45
import com.awesomeapp.module_3_260.Model260_47
import com.awesomeapp.module_3_260.Activity260_48

@Module
@InstallIn(SingletonComponent::class)
object Module_260 {
    @Provides
    @Singleton
    fun provideRepository260_5(
        api0: Api232_6 = Api232_6()
    ): Repository260_5 {
        return Repository260_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi260_6(): Api260_6 {
        return Api260_6()
    }
}