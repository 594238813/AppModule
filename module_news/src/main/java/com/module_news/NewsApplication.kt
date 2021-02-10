package com.module_news

import com.lib_base.base.BaseApplication
import com.module_news.di.newsModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
class NewsApplication : BaseApplication() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger()
            androidContext(this@NewsApplication)
            modules(newsModule)
        }

    }

}