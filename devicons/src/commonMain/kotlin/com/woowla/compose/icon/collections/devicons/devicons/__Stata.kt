package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.stata.OriginalWordmark
import kotlin.collections.List as ____KtList

public object StataGroup

public val Devicons.Stata: StataGroup
  get() = StataGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val StataGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(OriginalWordmark)
    return __AllIcons!!
  }
