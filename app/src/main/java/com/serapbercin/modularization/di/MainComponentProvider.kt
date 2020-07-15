package com.serapbercin.modularization.di

interface MainComponentProvider {

	fun getMainComponentProvider(): MainComponent.Builder
}