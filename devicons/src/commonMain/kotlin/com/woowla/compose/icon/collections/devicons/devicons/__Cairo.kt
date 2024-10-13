package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.cairo.Original
import com.woowla.compose.icon.collections.devicons.devicons.cairo.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.cairo.Plain
import com.woowla.compose.icon.collections.devicons.devicons.cairo.PlainWordmark
import kotlin.collections.List as ____KtList

public object CairoGroup

public val Devicons.Cairo: CairoGroup
  get() = CairoGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CairoGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
