package com.serapbercin.modularization

import android.app.Application
import com.serapbercin.core.di.CoreComponent
import com.serapbercin.core.di.CoreModule
import com.serapbercin.core.di.DaggerCoreComponent
import com.serapbercin.core.log.InitTimberProvider
import com.serapbercin.modularization.di.DaggerMainComponent
import com.serapbercin.modularization.di.MainComponent
import com.serapbercin.modularization.di.MainComponentProvider
import leakcanary.AppWatcher

class App : Application(), MainComponentProvider {

	private val coreComponent: CoreComponent by lazy {
		DaggerCoreComponent
				.builder()
				.coreModule(coreModule)
				.build()
	}

	private val coreModule: CoreModule by lazy {
		CoreModule(this)
	}

	override fun onCreate() {
		super.onCreate()
		InitTimberProvider().invoke()

		AppWatcher.config = AppWatcher.config.copy(watchFragmentViews = true)
	}

	override fun getMainComponentProvider(): MainComponent.Builder {
		return DaggerMainComponent
				.builder()
				.coreComponent(coreComponent)
	}
}
