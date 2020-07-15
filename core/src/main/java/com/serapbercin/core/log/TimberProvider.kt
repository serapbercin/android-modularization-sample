package com.serapbercin.core.log

import com.serapbercin.core.BuildConfig
import timber.log.Timber
import javax.inject.Inject

class InitTimberProvider @Inject constructor() : TimberProvider {

	override fun invoke() {
		if (BuildConfig.DEBUG) {
			Timber.plant(Timber.DebugTree())
		}
	}
}


interface TimberProvider {
	operator fun invoke()
}