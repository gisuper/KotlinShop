package com.yx.usercenter.service.impl

import com.yx.baselibrary.net.RetrofitFactory
import com.yx.usercenter.api.UserApi
import com.yx.usercenter.data.LoginUserEntity
import com.yx.usercenter.service.RegisiterService
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by yangxiong on 2020/5/8.
 */
class RegisiterServiceImpl @Inject constructor() : RegisiterService {
    override fun regisiter(phone: String, verifyCode: String, pwd: String) : Observable<LoginUserEntity> {


        return RetrofitFactory.instance.create(UserApi::class.java).loginByPhone(phone,pwd,"2")

    }
}