package com.yx.baselibrary.data

open class BaseJson {

    var isSuccess: Boolean = false
    var error: ErrorBean? = null


    inner class ErrorBean {
        /**
         * code : 701
         * message : 验证码错误
         */
        var extra: ExtraBean? = null
        var code: Int = 0
        var message: String? = null


    }


    inner class ExtraBean {
        var misKeys: List<String>? = null
    }
}
