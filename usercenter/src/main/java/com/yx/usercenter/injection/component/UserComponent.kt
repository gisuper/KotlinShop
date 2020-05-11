package com.yx.usercenter.injection.component

import com.yx.usercenter.App
import com.yx.usercenter.injection.module.ActivityModules
import com.yx.usercenter.injection.module.UserModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by yangxiong on 2020/5/9.
 */
@Component(modules = arrayOf(
    AndroidSupportInjectionModule::class,
    UserModule::class,
    ActivityModules::class))
interface UserComponent  : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}