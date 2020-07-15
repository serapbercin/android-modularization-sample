package com.serapbercin.core.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule(private val app: Application) {

	@Provides
	@Singleton
	fun provideContext(): Context = app.applicationContext
}