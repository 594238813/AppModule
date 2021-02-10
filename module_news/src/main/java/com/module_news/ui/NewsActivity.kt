package com.module_news.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.lib_base.base.BaseActivity
import com.lib_service.flutter.FlutterInstance
import com.lib_service.user.UserInstance
import com.lib_service.user.UserService
import com.module_news.R
import com.module_news.databinding.NewsHomeActivityBinding
import com.module_news.ui.viewmodel.NewsViewModel
import kotlinx.android.synthetic.main.news_home_activity.*

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
class NewsActivity:BaseActivity<NewsViewModel,NewsHomeActivityBinding>() {

    override fun getLayoutResId() = R.layout.news_home_activity

    companion object{
                fun start(context: Context){
                    var intnet = Intent(context,NewsActivity::class.java)
            context.startActivity(intnet)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btn_openuser.setOnClickListener {
            UserInstance.start(this)
        }

        btn_flutter.setOnClickListener {
            FlutterInstance.startFlutter(this)
        }

    }


}