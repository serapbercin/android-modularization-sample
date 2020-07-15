package com.serapbercin.core.ui.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(layoutRes: Int, root: ViewGroup = this, attachToRoot: Boolean = false): View =
		LayoutInflater
				.from(context)
				.inflate(layoutRes, root, attachToRoot)