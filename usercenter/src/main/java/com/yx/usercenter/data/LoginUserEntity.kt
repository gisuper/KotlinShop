package com.yx.usercenter.data


import com.yx.baselibrary.data.BaseJson

import java.io.Serializable

class LoginUserEntity : BaseJson(), Serializable {


    /**
     * payload : {"userId":"10000020","nickName":"","name":"","idCardNo":"","state":"","phone":"1326683****","email":"","status":"1","inviteUserId":"0","inviteCode":"G51MBT27","avatar":"/data/apps/account-service/public/image/default.jpg","lastLoginTime":"0","lastLoginIp":"","createTime":"1524649697","updateTime":"0","remark":"","regType":"1","bankCardNo":""}
     */

    var payload: PayloadBean? = null

    class PayloadBean {
        /**
         * userId : 10000020
         * nickName :
         * name :
         * idCardNo :
         * state :
         * phone : 1326683****
         * email :
         * status : 1
         * inviteUserId : 0
         * inviteCode : G51MBT27
         * avatar : /data/apps/account-service/public/image/default.jpg
         * lastLoginTime : 0
         * lastLoginIp :
         * createTime : 1524649697
         * updateTime : 0
         * remark :
         * regType : 1
         * bankCardNo :
         */

        var userId: String? = null
        var nickName: String? = null
        var name: String? = null
        var idCardNo: String? = null
        var state: String? = null
        var phone: String? = null
        var email: String? = null
        var status: String? = null
        var inviteUserId: String? = null
        var inviteCode: String? = null
        var avatar: String? = null
        var lastLoginTime: String? = null
        var lastLoginIp: String? = null
        var createTime: String? = null
        var updateTime: String? = null
        var remark: String? = null
        var regType: String? = null
        var bankCardNo: String? = null
        //"isBindGa":"1"绑定0//没有绑定
        var isBindGa: Int = 0
    }
}
