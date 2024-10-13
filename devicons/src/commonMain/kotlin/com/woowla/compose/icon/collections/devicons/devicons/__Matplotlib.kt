package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.matplotlib.Original
import com.woowla.compose.icon.collections.devicons.devicons.matplotlib.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.matplotlib.Plain
import com.woowla.compose.icon.collections.devicons.devicons.matplotlib.PlainWordmark
import kotlin.collections.List as ____KtList

public object MatplotlibGroup

public val Devicons.Matplotlib: MatplotlibGroup
  get() = MatplotlibGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MatplotlibGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
