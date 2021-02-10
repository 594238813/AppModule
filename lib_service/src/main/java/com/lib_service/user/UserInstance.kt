package com.lib_service.user

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.launcher.ARouter
import com.lib_service.USER_SERVICE_PATH

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
object UserInstance {

    @Autowired(name = USER_SERVICE_PATH)
    lateinit var service: UserService

    init{
        ARouter.getInstance().inject(this)
    }


    fun start(context: Context) {
        return service.start(context)
    }
}