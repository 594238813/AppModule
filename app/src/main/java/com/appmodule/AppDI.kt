package com.appmodule

import com.di.homeViewModel
import com.module_home.HomeViewModel
import com.module_news.di.newsViewModel
import com.module_user.di.userViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */

val appModule = listOf(
    homeViewModel,newsViewModel, userViewModel

)