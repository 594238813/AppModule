package com.appmodule

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.di.homeModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 *  author : hyt
 *  date : 2021/2/3
 *  description :
 */
class AppModuleApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        ARouter.init(this)

        startKoin{
            androidLogger()
            androidContext(this@AppModuleApplication)
            modules(appModule)
        }

    }

}