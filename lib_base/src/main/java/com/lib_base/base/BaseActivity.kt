package com.lib_base.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel

import kotlin.reflect.KClass

/**
 *  author : hyt
 *  date : 2021/2/3
 *  description :
 */
abstract class BaseActivity<VM :ViewModel,VDB :ViewDataBinding> :AppCompatActivity() {

    lateinit var mViewModel: VM
    lateinit var mViewBinding: VDB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = DataBindingUtil.setContentView(this, getLayoutResId())

        initViewModel()


    }

    private fun initViewModel() {
        val clazz =
            this.javaClass.kotlin.supertypes[0].arguments[0].type!!.classifier!! as KClass<VM>
        mViewModel = getViewModel(clazz = clazz)
    }

    abstract fun getLayoutResId(): Int
}