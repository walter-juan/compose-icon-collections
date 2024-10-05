package com.woowla.compose.icon.collections.sample

import android.os.Build

actual fun getPlatformName(): String =  "Android ${Build.VERSION.SDK_INT}"