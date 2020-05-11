package com.yx.usercenter.activity

import android.util.Log
import com.yx.baselibrary.ext.excute
import com.yx.baselibrary.presenter.BasePresenter
import com.yx.baselibrary.rx.BaseObserver
import com.yx.usercenter.data.LoginUserEntity
import com.yx.usercenter.service.RegisiterService
import javax.inject.Inject

/**
 * Created by yangxiong on 2020/5/7.
 */
open class RegisiterPresenter @Inject constructor() : BasePresenter<RegisiterView>() {

    @Inject
    lateinit var regisiterService : RegisiterService

    fun regisiter(phone: String, verifyCode: String, pwd: String) {

        regisiterService.regisiter(phone, verifyCode, pwd)
            .excute(object : BaseObserver<LoginUserEntity>() {
                override fun success(data: LoginUserEntity) {
                    val toJSONString = com.alibaba.fastjson.JSON.toJSONString(data)
                Log.d("yangxiong","data : ${toJSONString}")
                    mView.onRegisterResult(toJSONString)
                }
            })
    }
}