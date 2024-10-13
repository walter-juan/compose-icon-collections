package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ifttt.Original
import kotlin.collections.List as ____KtList

public object IftttGroup

public val Devicons.Ifttt: IftttGroup
  get() = IftttGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val IftttGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original)
    return __AllIcons!!
  }
