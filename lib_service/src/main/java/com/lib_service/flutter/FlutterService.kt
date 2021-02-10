package com.lib_service.flutter

import android.content.Context
import com.alibaba.android.arouter.facade.template.IProvider

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
interface FlutterService: IProvider {
    fun start(context: Context)
}