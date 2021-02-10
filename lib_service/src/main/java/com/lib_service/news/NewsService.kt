package com.lib_service.news

import android.content.Context
import com.alibaba.android.arouter.facade.template.IProvider

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
interface NewsService: IProvider {
    fun start(context: Context)
}