package com.yx.baselibrary.ext

import com.yx.baselibrary.rx.BaseObserver
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by yangxiong on 2020/5/8.
 */
fun <T> Observable<T>.excute(observer: BaseObserver<T>) {

    return this.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
        .subscribe(observer)

}