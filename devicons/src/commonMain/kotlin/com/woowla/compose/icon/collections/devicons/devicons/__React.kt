package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.react.Original
import com.woowla.compose.icon.collections.devicons.devicons.react.OriginalWordmark
import kotlin.collections.List as ____KtList

public object ReactGroup

public val Devicons.React: ReactGroup
  get() = ReactGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ReactGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
