package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.jule.Original
import com.woowla.compose.icon.collections.devicons.devicons.jule.OriginalWordmark
import kotlin.collections.List as ____KtList

public object JuleGroup

public val Devicons.Jule: JuleGroup
  get() = JuleGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JuleGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
