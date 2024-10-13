package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.windows8.Original
import com.woowla.compose.icon.collections.devicons.devicons.windows8.OriginalWordmark
import kotlin.collections.List as ____KtList

public object Windows8Group

public val Devicons.Windows8: Windows8Group
  get() = Windows8Group

private var __AllIcons: ____KtList<ImageVector>? = null

public val Windows8Group.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
