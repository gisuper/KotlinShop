package com.yx.usercenter.injection.module

import com.yx.usercenter.injection.ActivityScoped
import com.yx.usercenter.service.RegisiterService
import com.yx.usercenter.service.impl.RegisiterServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Created by yangxiong on 2020/5/9.
 */
@Module
class UserModule {

    @Provides
    @ActivityScoped
    fun providerRegisiterService(regisiterService: RegisiterServiceImpl): RegisiterService {
        return regisiterService
    }
}