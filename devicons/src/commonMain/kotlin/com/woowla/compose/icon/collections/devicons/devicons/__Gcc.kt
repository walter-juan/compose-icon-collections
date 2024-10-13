package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.gcc.Line
import com.woowla.compose.icon.collections.devicons.devicons.gcc.Original
import com.woowla.compose.icon.collections.devicons.devicons.gcc.Plain
import kotlin.collections.List as ____KtList

public object GccGroup

public val Devicons.Gcc: GccGroup
  get() = GccGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GccGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
