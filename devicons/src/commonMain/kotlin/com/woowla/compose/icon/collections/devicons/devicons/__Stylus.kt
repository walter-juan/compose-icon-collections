package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.stylus.Original
import kotlin.collections.List as ____KtList

public object StylusGroup

public val Devicons.Stylus: StylusGroup
  get() = StylusGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val StylusGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original)
    return __AllIcons!!
  }
