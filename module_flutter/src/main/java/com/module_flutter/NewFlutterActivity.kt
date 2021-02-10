package com.module_flutter

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import io.flutter.Log
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.EventChannel
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugins.GeneratedPluginRegistrant


/**
 *  author : hyt
 *  date : 2020/9/8
 *  description :
 */
class NewFlutterActivity : FlutterActivity() {

    companion object{
        fun start(context: Context){
            var intnet = Intent(context,NewFlutterActivity::class.java)
            context.startActivity(intnet)
        }
    }

    var CHANNEL = "newFlutterChannel"
    lateinit var methodChannel:MethodChannel
    lateinit var eventChannel:EventChannel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = 0
        }

        Handler().post(Runnable {
            val map = mutableMapOf<String, String>()
            map["content"] = "传递的数据"
            if (methodChannel != null) {
                // 向Flutter 发送消息
//                methodChannel.invokeMethod("showText", map)
                methodChannel.invokeMethod("showText", map, object : MethodChannel.Result {
                    //2
                    override fun success(o: Any?) {
                        Log.e("invokeMethod", o.toString())
                    }

                    override fun error(errorCode: String, errorMsg: String?, errorDetail: Any?) {
                        Log.d(
                            "invokeMethod",
                            "errorCode:" + errorCode + " errorMsg:" + errorMsg + " errorDetail:" + errorDetail as String?
                        )
                    }

                    override fun notImplemented() {
                        Log.d("invokeMethod", "notImplemented")
                    }
                })
            }
        })
    }



    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine)


        eventChannel = EventChannel(flutterEngine?.dartExecutor, "newFlutterEventChannel")
        eventChannel.setStreamHandler(object : EventChannel.StreamHandler {
            override fun onListen(arguments: Any?, events: EventChannel.EventSink?) {
                events?.success("Android")
            }

            override fun onCancel(arguments: Any?) {
            }
        })

        methodChannel = MethodChannel(flutterEngine?.dartExecutor, CHANNEL)
        methodChannel.setMethodCallHandler { call, result ->
            when (call.method) {
                "abc" -> {
                    Log.i("onMethodCall", "abc")
                    result.success("onMethodCall-abc")
                }
                "def" -> {
                    Log.i("onMethodCall", "def")
                    result.success("onMethodCall-def")
                }
            }
        }
    }



}