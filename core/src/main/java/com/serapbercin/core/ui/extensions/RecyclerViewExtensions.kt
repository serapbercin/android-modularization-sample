package com.serapbercin.core.ui.extensions

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

fun spacesItemDecoration(spaceHeight: Int): RecyclerView.ItemDecoration {
	return object : RecyclerView.ItemDecoration() {
		override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
			super.getItemOffsets(outRect, view, parent, state)
			with(outRect) {
				top = spaceHeight
				left = spaceHeight
				right = spaceHeight
				bottom = spaceHeight
			}
		}
	}
}