package com.yx.usercenter.activity

import android.os.Bundle
import android.widget.Toast
import com.yx.baselibrary.ui.activity.BaseMvpActivity
import com.yx.usercenter.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : BaseMvpActivity<RegisiterPresenter>(),RegisiterView {
    override fun onRegisterResult(result: String) {
        Toast.makeText(this,"${result}",Toast.LENGTH_LONG).show();
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mPresenter = RegisiterPresenter()
        mPresenter.mView = this
        btn_register.setOnClickListener {
            Toast.makeText(this,"注册",Toast.LENGTH_LONG).show();
            mPresenter.regisiter();
        }
    }
}
