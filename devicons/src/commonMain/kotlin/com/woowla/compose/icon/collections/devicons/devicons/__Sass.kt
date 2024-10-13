package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.sass.Original
import kotlin.collections.List as ____KtList

public object SassGroup

public val Devicons.Sass: SassGroup
  get() = SassGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SassGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original)
    return __AllIcons!!
  }
