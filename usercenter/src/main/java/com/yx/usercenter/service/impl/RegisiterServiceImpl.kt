package com.yx.usercenter.service.impl

import com.yx.usercenter.service.RegisterService
import io.reactivex.Observable

/**
 * Created by yangxiong on 2020/5/8.
 */
class RegisiterServiceImpl : RegisterService {
    override fun regisiter(phone: String, verifyCode: String, pwd: String) : Observable<Boolean> {
        return Observable.just(true)

    }
}