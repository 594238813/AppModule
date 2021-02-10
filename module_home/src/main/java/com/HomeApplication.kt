package com

import com.di.homeModule
import com.lib_base.base.BaseApplication
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
class HomeApplication : BaseApplication() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger()
            androidContext(this@HomeApplication)
            modules(homeModule)
        }

    }

}