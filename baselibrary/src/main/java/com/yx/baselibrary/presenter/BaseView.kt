package com.yx.baselibrary.presenter

/**
 * Created by yangxiong on 2020/5/7.
 */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError(text:String)
}