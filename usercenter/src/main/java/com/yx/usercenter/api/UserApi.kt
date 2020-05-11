package com.yx.usercenter.api

import com.yx.usercenter.data.LoginUserEntity
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by yangxiong on 2020/5/8.
 */
interface UserApi {
    /**
     * 手机登录
     * @param account
     * @param password
     * @return
     */

    @POST("user/loginByPhone")
    @FormUrlEncoded
    fun loginByPhone(
        @Field("account") account: String,
        @Field("password") password: String,
        @Field("regPlatForm") regPlatForm: String
    ): Observable<LoginUserEntity>
}