package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.android.Original
import com.woowla.compose.icon.collections.devicons.devicons.android.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.android.Plain
import com.woowla.compose.icon.collections.devicons.devicons.android.PlainWordmark
import kotlin.collections.List as ____KtList

public object AndroidGroup

public val Devicons.Android: AndroidGroup
  get() = AndroidGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AndroidGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
