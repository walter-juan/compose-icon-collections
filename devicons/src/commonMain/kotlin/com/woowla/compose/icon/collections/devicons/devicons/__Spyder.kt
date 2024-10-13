package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.spyder.Original
import com.woowla.compose.icon.collections.devicons.devicons.spyder.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.spyder.Plain
import com.woowla.compose.icon.collections.devicons.devicons.spyder.PlainWordmark
import kotlin.collections.List as ____KtList

public object SpyderGroup

public val Devicons.Spyder: SpyderGroup
  get() = SpyderGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SpyderGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
