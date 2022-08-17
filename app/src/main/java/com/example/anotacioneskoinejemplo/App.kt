package com.example.anotacioneskoinejemplo

import android.app.Application
import android.util.Log
import com.example.anotacioneskoinejemplo.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module

class App: Application() {

    companion object {
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        startKoin {
            Log.i("TEST", "llego")
            androidLogger()
            androidContext(this@App)
            modules(
                AppModule().module
            )
        }
    }
}