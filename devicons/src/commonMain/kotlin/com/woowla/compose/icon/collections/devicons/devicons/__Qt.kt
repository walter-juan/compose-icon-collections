package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.qt.Original
import kotlin.collections.List as ____KtList

public object QtGroup

public val Devicons.Qt: QtGroup
  get() = QtGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val QtGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original)
    return __AllIcons!!
  }
