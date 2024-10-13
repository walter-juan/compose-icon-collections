package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.emacs.Original
import kotlin.collections.List as ____KtList

public object EmacsGroup

public val Devicons.Emacs: EmacsGroup
  get() = EmacsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val EmacsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original)
    return __AllIcons!!
  }
