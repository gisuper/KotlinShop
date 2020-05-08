package com.yx.usercenter.service

import io.reactivex.Observable

/**
 * Created by yangxiong on 2020/5/8.
 */
interface RegisterService {
    fun regisiter(phone:String,verifyCode:String,pwd:String): Observable<Boolean>
}