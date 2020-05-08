package com.yx.usercenter.activity

import com.yx.baselibrary.presenter.BasePresenter
import com.yx.baselibrary.rx.BaseObserver
import com.yx.baselibrary.rx.NetworkScheduler
import com.yx.usercenter.service.impl.RegisiterServiceImpl

/**
 * Created by yangxiong on 2020/5/7.
 */
open class RegisiterPresenter : BasePresenter<RegisiterView>() {
    fun regisiter(phone: String, verifyCode: String, pwd: String) {

        val regisiterServiceImpl = RegisiterServiceImpl()

        regisiterServiceImpl.regisiter(phone, verifyCode, pwd)
            .compose(NetworkScheduler.compose())
            .subscribe(object : BaseObserver<Boolean>() {
                override fun success(data: Boolean) {

                }
            })


    }
}