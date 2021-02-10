package com.module_news.modelservice

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.lib_service.NEWS_SERVICE_PATH
import com.lib_service.news.NewsService
import com.module_news.ui.NewsActivity

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
@Route(path = NEWS_SERVICE_PATH)
class NewsServiceImpl : NewsService {

    override fun init(context: Context?) {

    }

    override fun start(context: Context) {
        NewsActivity.start(context)
    }

}