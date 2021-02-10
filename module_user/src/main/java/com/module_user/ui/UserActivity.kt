package com.module_user.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.lib_base.base.BaseActivity
import com.module_user.R
import com.module_user.databinding.UserActivityBinding
import com.module_user.ui.viewmodel.UserViewModel

class UserActivity : BaseActivity<UserViewModel,UserActivityBinding>() {

    override fun getLayoutResId() = R.layout.user_activity

    companion object{
        fun start(context: Context){
            var intnet = Intent(context,UserActivity::class.java)
            context.startActivity(intnet)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}