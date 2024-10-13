package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.windows11.Original
import com.woowla.compose.icon.collections.devicons.devicons.windows11.OriginalWordmark
import kotlin.collections.List as ____KtList

public object Windows11Group

public val Devicons.Windows11: Windows11Group
  get() = Windows11Group

private var __AllIcons: ____KtList<ImageVector>? = null

public val Windows11Group.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
