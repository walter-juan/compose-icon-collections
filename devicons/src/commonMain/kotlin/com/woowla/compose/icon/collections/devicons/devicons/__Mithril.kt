package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.mithril.Line
import com.woowla.compose.icon.collections.devicons.devicons.mithril.Original
import kotlin.collections.List as ____KtList

public object MithrilGroup

public val Devicons.Mithril: MithrilGroup
  get() = MithrilGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MithrilGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original)
    return __AllIcons!!
  }
