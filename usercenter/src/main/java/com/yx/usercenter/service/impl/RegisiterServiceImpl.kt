package com.yx.usercenter.service.impl

import com.yx.baselibrary.net.RetrofitFactory
import com.yx.usercenter.api.UserApi
import com.yx.usercenter.data.LoginUserEntity
import com.yx.usercenter.service.RegisterService
import io.reactivex.Observable

/**
 * Created by yangxiong on 2020/5/8.
 */
class RegisiterServiceImpl : RegisterService {
    override fun regisiter(phone: String, verifyCode: String, pwd: String) : Observable<LoginUserEntity> {


        return RetrofitFactory.instance.create(UserApi::class.java).loginByPhone(phone,pwd,"2")

    }
}