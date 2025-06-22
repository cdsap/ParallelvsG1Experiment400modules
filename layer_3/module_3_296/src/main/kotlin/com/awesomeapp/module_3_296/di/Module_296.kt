package com.awesomeapp.module_3_296.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_296.Viewmodel296_1
import com.awesomeapp.module_3_296.Activity296_2
import com.awesomeapp.module_3_296.Activity296_3
import com.awesomeapp.module_3_296.Fragment296_4
import com.awesomeapp.module_3_296.Repository296_5
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_240.Api240_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_216.Api216_6
import com.awesomeapp.module_2_220.Api220_6
import com.awesomeapp.module_2_212.Api212_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_236.Api236_6
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_2_228.Api228_6
import com.awesomeapp.module_2_224.Api224_6
import com.awesomeapp.module_2_168.Api168_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_3_296.Api296_6
import com.awesomeapp.module_3_296.Model296_8
import com.awesomeapp.module_3_296.Model296_9
import com.awesomeapp.module_3_296.Activity296_10
import com.awesomeapp.module_3_296.Model296_12

@Module
@InstallIn(SingletonComponent::class)
object Module_296 {
    @Provides
    @Singleton
    fun provideRepository296_5(
        api0: Api176_6 = Api176_6(),
        api1: Api164_6 = Api164_6(),
        api2: Api240_6 = Api240_6(),
        api3: Api192_6 = Api192_6(),
        api4: Api196_6 = Api196_6(),
        api5: Api216_6 = Api216_6(),
        api6: Api220_6 = Api220_6(),
        api7: Api212_6 = Api212_6(),
        api8: Api180_6 = Api180_6(),
        api9: Api236_6 = Api236_6(),
        api10: Api204_6 = Api204_6(),
        api11: Api188_6 = Api188_6(),
        api12: Api228_6 = Api228_6(),
        api13: Api224_6 = Api224_6(),
        api14: Api168_6 = Api168_6(),
        api15: Api208_6 = Api208_6(),
        api16: Api200_6 = Api200_6()
    ): Repository296_5 {
        return Repository296_5(api0, 
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
        api13, 
        api14, 
        api15, 
        api16)
    }

    @Provides
    @Singleton
    fun provideApi296_6(): Api296_6 {
        return Api296_6()
    }
}