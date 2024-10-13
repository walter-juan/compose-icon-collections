package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ie10.Original
import kotlin.collections.List as ____KtList

public object Ie10Group

public val Devicons.Ie10: Ie10Group
  get() = Ie10Group

private var __AllIcons: ____KtList<ImageVector>? = null

public val Ie10Group.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original)
    return __AllIcons!!
  }
