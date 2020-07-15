package com.serapbercin.core.ui.extensions

import android.widget.ImageView
import coil.api.load
import coil.size.Scale
import coil.transform.CircleCropTransformation
import com.serapbercin.core.R

fun ImageView.loadNews(imageUrl: String) {
	load(imageUrl) {
		crossfade(true)
		placeholder(R.drawable.ic_launcher_background)
		scale(Scale.FILL)
	}
}

fun ImageView.loadCircle(imageUrl: String) {
	load(imageUrl) {
		crossfade(true)
		placeholder(R.drawable.ic_launcher_background)
		transformations(CircleCropTransformation())
	}
}