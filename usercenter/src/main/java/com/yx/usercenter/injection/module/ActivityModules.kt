package com.yx.usercenter.injection.module

import com.yx.usercenter.activity.RegisterActivity
import com.yx.usercenter.injection.ActivityScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by yangxiong on 2020/5/11.
 */
@Module
abstract class ActivityModules {
    @ActivityScoped
    @ContributesAndroidInjector(modules = arrayOf(UserModule::class))
    abstract fun registerActivity() : RegisterActivity
}