package com.yx.baselibrary.ui.activity

import com.yx.baselibrary.presenter.BasePresenter
import com.yx.baselibrary.presenter.BaseView
import javax.inject.Inject

/**
 * Created by yangxiong on 2020/5/7.
 */
open class BaseMvpActivity<T : BasePresenter<*>>:BaseActivity(),BaseView {
    @Inject
    lateinit var mPresenter:T
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError(text: String) {
    }
}