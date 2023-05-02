package com.awilab.socketio.common

import android.app.Application
import android.util.Log
import com.amplifyframework.AmplifyException
import com.amplifyframework.core.Amplify

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        try {
            Amplify.configure(applicationContext)
            Log.d("${::App.name},${::onCreate.name}", "Amplify initialize success.")
        } catch (e: AmplifyException) {
            Log.e("${::App.name},${::onCreate.name}", "Amplify initialize fail.", e)
        }
    }
}