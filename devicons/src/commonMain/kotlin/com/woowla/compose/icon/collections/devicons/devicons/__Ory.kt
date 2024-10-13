package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ory.Original
import com.woowla.compose.icon.collections.devicons.devicons.ory.OriginalWordmark
import kotlin.collections.List as ____KtList

public object OryGroup

public val Devicons.Ory: OryGroup
  get() = OryGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OryGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
