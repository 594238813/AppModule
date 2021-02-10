package com.lib_service.news

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.launcher.ARouter
import com.lib_service.NEWS_SERVICE_PATH

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
object NewsInstance {

    @Autowired(name = NEWS_SERVICE_PATH)
    lateinit var service: NewsService

    init{
        ARouter.getInstance().inject(this)
    }


    fun start(context: Context) {
        return service.start(context)
    }
}