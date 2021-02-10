package com.module_flutter.moduleservice

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.lib_service.FLUTTER_SERVICE_PATH
import com.lib_service.flutter.FlutterService
import com.module_flutter.NewFlutterActivity

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
@Route(path = FLUTTER_SERVICE_PATH)
class FlutterServiceImpl : FlutterService {

    override fun init(context: Context?) {

    }

    override fun start(context: Context) {
        NewFlutterActivity.start(context)
    }

}