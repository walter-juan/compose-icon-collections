package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.p5js.Original
import kotlin.collections.List as ____KtList

public object P5jsGroup

public val Devicons.P5js: P5jsGroup
  get() = P5jsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val P5jsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original)
    return __AllIcons!!
  }
