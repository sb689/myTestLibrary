package com.eqworks.mytestlibrary

import android.app.Application
import com.eqworks.mytestlibraryapp.BuildConfig
import timber.log.Timber

class MyTestLibraryApp : Application(){

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        Timber.d("MyTestLibraryApp called")
    }
}