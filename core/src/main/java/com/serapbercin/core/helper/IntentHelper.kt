@file:JvmName("IntentHelper")

package com.serapbercin.core.helper

import android.content.Context
import android.content.Intent
import android.net.Uri

fun Context.intentToActionView(newsLink: String) {
	this.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(newsLink)))
}
