package com.lib_service.flutter

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.launcher.ARouter
import com.lib_service.FLUTTER_SERVICE_PATH

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
object FlutterInstance {

    @Autowired(name = FLUTTER_SERVICE_PATH)
    lateinit var service: FlutterService

    init{
        ARouter.getInstance().inject(this)
    }


    fun startFlutter(context: Context) {
        return service.start(context)
    }
}