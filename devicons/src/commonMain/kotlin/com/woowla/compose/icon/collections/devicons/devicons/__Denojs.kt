package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.denojs.Original
import com.woowla.compose.icon.collections.devicons.devicons.denojs.OriginalWordmark
import kotlin.collections.List as ____KtList

public object DenojsGroup

public val Devicons.Denojs: DenojsGroup
  get() = DenojsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DenojsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
