package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.purescript.Original
import com.woowla.compose.icon.collections.devicons.devicons.purescript.OriginalWordmark
import kotlin.collections.List as ____KtList

public object PurescriptGroup

public val Devicons.Purescript: PurescriptGroup
  get() = PurescriptGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PurescriptGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
