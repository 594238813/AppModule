package com.di

import com.module_home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
val homeViewModel = module {
    viewModel { HomeViewModel() }
}

val homeModule = listOf(
    homeViewModel
)