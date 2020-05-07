package com.yx.baselibrary.presenter

/**
 * Created by yangxiong on 2020/5/7.
 */
open class BasePresenter<T : BaseView> {
    lateinit var mView:T
}