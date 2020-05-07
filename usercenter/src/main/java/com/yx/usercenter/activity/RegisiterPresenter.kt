package com.yx.usercenter.activity

import com.yx.baselibrary.presenter.BasePresenter

/**
 * Created by yangxiong on 2020/5/7.
 */
open class RegisiterPresenter : BasePresenter<RegisiterView>() {
    fun regisiter() {

        mView.onRegisterResult("注册成功")
    }
}