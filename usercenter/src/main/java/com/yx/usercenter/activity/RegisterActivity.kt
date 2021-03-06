package com.yx.usercenter.activity

import android.os.Bundle
import android.widget.Toast
import com.yx.baselibrary.ui.activity.BaseMvpActivity
import com.yx.usercenter.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : BaseMvpActivity<RegisiterPresenter>(),RegisiterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter.mView = this
        btn_register.setOnClickListener {
            mPresenter.regisiter(et_input_phone.text.toString(),et_input_verify_code.text.toString()
                ,et_input_password.text.toString())
        }
    }

    override fun onRegisterResult(result: String) {
        Toast.makeText(this,"${result}",Toast.LENGTH_LONG).show();
    }

}
