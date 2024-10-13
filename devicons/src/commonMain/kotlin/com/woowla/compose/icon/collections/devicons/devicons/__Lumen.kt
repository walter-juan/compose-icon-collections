package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.lumen.Original
import kotlin.collections.List as ____KtList

public object LumenGroup

public val Devicons.Lumen: LumenGroup
  get() = LumenGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val LumenGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original)
    return __AllIcons!!
  }
