package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.figma.Original
import com.woowla.compose.icon.collections.devicons.devicons.figma.Plain
import kotlin.collections.List as ____KtList

public object FigmaGroup

public val Devicons.Figma: FigmaGroup
  get() = FigmaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FigmaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
