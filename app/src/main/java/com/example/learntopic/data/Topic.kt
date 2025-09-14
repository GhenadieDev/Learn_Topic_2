package com.example.learntopic.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
	@DrawableRes var imageResId: Int,
	@StringRes var name: Int
)
