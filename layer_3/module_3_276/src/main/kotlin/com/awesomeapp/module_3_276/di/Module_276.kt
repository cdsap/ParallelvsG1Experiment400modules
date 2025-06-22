package com.awesomeapp.module_3_276.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_276.Viewmodel276_1
import com.awesomeapp.module_3_276.Activity276_2
import com.awesomeapp.module_3_276.Activity276_3
import com.awesomeapp.module_3_276.Fragment276_4
import com.awesomeapp.module_3_276.Repository276_5
import com.awesomeapp.module_2_224.Api224_6
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_276.Usecase276_7
import com.awesomeapp.module_3_276.Model276_9
import com.awesomeapp.module_3_276.Model276_10
import com.awesomeapp.module_3_276.Activity276_11
import com.awesomeapp.module_3_276.Model276_13
import com.awesomeapp.module_3_276.Activity276_14
import com.awesomeapp.module_3_276.Model276_16
import com.awesomeapp.module_3_276.Activity276_17
import com.awesomeapp.module_3_276.Model276_19
import com.awesomeapp.module_3_276.Activity276_20
import com.awesomeapp.module_3_276.Model276_22
import com.awesomeapp.module_3_276.Activity276_23
import com.awesomeapp.module_3_276.Model276_25
import com.awesomeapp.module_3_276.Activity276_26
import com.awesomeapp.module_3_276.Model276_28
import com.awesomeapp.module_3_276.Activity276_29
import com.awesomeapp.module_3_276.Model276_31
import com.awesomeapp.module_3_276.Activity276_32
import com.awesomeapp.module_3_276.Model276_34
import com.awesomeapp.module_3_276.Activity276_35
import com.awesomeapp.module_3_276.Model276_37
import com.awesomeapp.module_3_276.Activity276_38
import com.awesomeapp.module_3_276.Model276_40
import com.awesomeapp.module_3_276.Activity276_41
import com.awesomeapp.module_3_276.Model276_43
import com.awesomeapp.module_3_276.Activity276_44

@Module
@InstallIn(SingletonComponent::class)
object Module_276 {
    @Provides
    @Singleton
    fun provideRepository276_5(
        api0: Api224_6 = Api224_6()
    ): Repository276_5 {
        return Repository276_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi276_6(): Api276_6 {
        return Api276_6()
    }
}