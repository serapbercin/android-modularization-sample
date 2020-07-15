package com.serapbercin.core.di

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class HttpModule {

	@Provides
	@Singleton
	fun provideGson(): Gson = Gson()
}
