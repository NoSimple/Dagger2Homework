package ru.otus.daggerhomework.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationComponent {

    @AppContext
    fun appContext(): Context

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance @AppContext appContext: Context): ApplicationComponent
    }
}