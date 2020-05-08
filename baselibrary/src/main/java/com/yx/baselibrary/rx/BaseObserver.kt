package com.yx.baselibrary.rx

import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * Created by yangxiong on 2020/5/8.
 */
abstract class BaseObserver<T>() : Observer<T> {
    abstract fun success(data: T)
    fun failure(msg: String){}

    override fun onSubscribe(d: Disposable) {

    }

    override fun onNext(t: T) {
        success(t)
    }

    override fun onComplete() {

    }

    override fun onError(e: Throwable) {
        e.message?.let { failure(it) }
    }

}

