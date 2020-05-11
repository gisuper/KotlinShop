package com.yx.usercenter

import com.yx.usercenter.injection.component.DaggerUserComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * Created by yangxiong on 2020/5/11.
 */
class App : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerUserComponent.builder().create(this)
    }
}