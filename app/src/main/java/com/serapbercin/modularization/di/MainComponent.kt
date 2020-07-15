package com.serapbercin.modularization.di

import com.serapbercin.core.di.CoreComponent
import com.serapbercin.core.di.scope.FeatureScope
import com.serapbercin.modularization.MainActivity
import dagger.BindsInstance
import dagger.Component

@FeatureScope
@Component(dependencies = [CoreComponent::class])
interface MainComponent {

	fun inject(mainActivity: MainActivity)

	@Component.Builder
	interface Builder {

		fun build(): MainComponent

		@BindsInstance
		fun mainActivity(activity: MainActivity): Builder
		fun coreComponent(module: CoreComponent): Builder
	}
}