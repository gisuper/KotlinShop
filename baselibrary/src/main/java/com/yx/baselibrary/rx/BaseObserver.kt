package com.yx.baselibrary.rx

import android.util.Log
import com.yx.baselibrary.data.BaseJson
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
        Log.d("yangxiong","t : ${t.toString()}")
        if (t is BaseJson){

            if (!t.isSuccess){
                Log.e("yangxiong","code : ${t.error?.code},message : ${t.error?.message}")
            }
        }

        success(t)
    }

    override fun onComplete() {
        Log.d("yangxiong","~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Complete~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    }

    override fun onError(e: Throwable) {
        Log.e("yangxiong","onError message : ${e.message}")
        e.message?.let { failure(it) }
    }

}

