package com.module_user.modelservice

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.lib_service.USER_SERVICE_PATH
import com.lib_service.user.UserService
import com.module_user.ui.UserActivity

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
@Route(path = USER_SERVICE_PATH)
class UserServiceImpl : UserService {

    override fun init(context: Context?) {

    }

    override fun start(context: Context) {
        UserActivity.start(context)
    }

}