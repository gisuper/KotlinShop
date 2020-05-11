package com.yx.usercenter.service

import com.yx.usercenter.data.LoginUserEntity
import io.reactivex.Observable

/**
 * Created by yangxiong on 2020/5/8.
 */
interface RegisiterService {
    fun regisiter(phone:String,verifyCode:String,pwd:String): Observable<LoginUserEntity>
}