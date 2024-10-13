package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ghost.Original
import com.woowla.compose.icon.collections.devicons.devicons.ghost.OriginalWordmark
import kotlin.collections.List as ____KtList

public object GhostGroup

public val Devicons.Ghost: GhostGroup
  get() = GhostGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GhostGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
