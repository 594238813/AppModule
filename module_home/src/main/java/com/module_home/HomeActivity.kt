package com.module_home

import android.os.Bundle
import com.lib_base.base.BaseActivity
import com.lib_service.news.NewsInstance
import com.module_home.databinding.HomeMainActivityBinding

class HomeActivity : BaseActivity<HomeViewModel, HomeMainActivityBinding>() {

    override fun getLayoutResId() = R.layout.home_main_activity



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mViewBinding.btnNews.setOnClickListener {
            NewsInstance.start(this)
        }
        mViewBinding.btnUser.setOnClickListener {  }

    }

}