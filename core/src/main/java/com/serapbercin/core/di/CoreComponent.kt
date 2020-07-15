package com.serapbercin.core.di

import android.content.Context
import com.google.gson.Gson
import dagger.Component
import javax.inject.Singleton

/**
 * Component providing application wide singletons.
 *
 */
@Component(modules = [CoreModule::class, HttpModule::class])
@Singleton
interface CoreComponent {

	@Component.Builder
	interface Builder {
		fun build(): CoreComponent
		fun coreModule(module: CoreModule): Builder
	}

	fun provideGson(): Gson
	fun provideContext(): Context
}
