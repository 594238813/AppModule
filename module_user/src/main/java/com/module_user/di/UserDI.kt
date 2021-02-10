package com.module_user.di

import com.module_user.ui.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 *  author : hyt
 *  date : 2021/2/7
 *  description :
 */
val userViewModel = module {
    viewModel { UserViewModel() }
}

val userModule = listOf(
    userViewModel
)