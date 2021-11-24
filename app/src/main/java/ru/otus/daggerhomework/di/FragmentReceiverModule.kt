package ru.otus.daggerhomework.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
interface FragmentReceiverModule {

    @FragmentScope
    @Binds
    fun bindViewModelProviderFactory(): ViewModelProvider.Factory
}