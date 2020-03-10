package com.mogmet.traveltest.di

import com.mogmet.traveltest.fragment.AmericaViewModel
import com.mogmet.traveltest.fragment.TopViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val viewModelModule = module {
    viewModel { TopViewModel() }
    viewModel { AmericaViewModel() }
}

object MainModule {
    val modules = listOf(viewModelModule)
}