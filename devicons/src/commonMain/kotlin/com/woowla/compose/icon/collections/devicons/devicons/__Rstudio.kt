package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.rstudio.Original
import com.woowla.compose.icon.collections.devicons.devicons.rstudio.Plain
import kotlin.collections.List as ____KtList

public object RstudioGroup

public val Devicons.Rstudio: RstudioGroup
  get() = RstudioGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RstudioGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
