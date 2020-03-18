package com.mogmet.traveltest

import android.app.Application
import com.mogmet.traveltest.di.MainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(MainModule.modules)
        }
    }
}