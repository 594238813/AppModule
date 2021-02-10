package com.module_news.di

import com.module_news.ui.viewmodel.NewsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
val newsViewModel = module {
    viewModel { NewsViewModel() }
}

val newsModule = listOf(
    newsViewModel
)