package com.eqworks.mytestlibraryapp

import android.app.Application
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