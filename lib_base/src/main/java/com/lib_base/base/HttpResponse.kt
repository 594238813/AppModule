package com.lib_base.base

/**
 *  author : hyt
 *  date : 2021/2/5
 *  description :
 */
sealed class HttpResponse<out T:Any> {

    data class Success<out T : Any>(val data: T?) :  HttpResponse<T>()

    data class Error(val exception: HttpException) : HttpResponse<Nothing>()

}

class HttpException(var errCode: String?, var msg: String?) : Exception(msg)