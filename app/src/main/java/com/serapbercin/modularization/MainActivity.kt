package com.serapbercin.modularization

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.serapbercin.modularization.di.MainComponentProvider

class MainActivity : AppCompatActivity(R.layout.activity_main) {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		(applicationContext as MainComponentProvider)
				.getMainComponentProvider()
				.mainActivity(this)
				.build()
				.inject(this)
	}
}
