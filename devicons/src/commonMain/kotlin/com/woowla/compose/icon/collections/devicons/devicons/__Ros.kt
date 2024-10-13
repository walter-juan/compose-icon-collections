package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ros.Original
import com.woowla.compose.icon.collections.devicons.devicons.ros.OriginalWordmark
import kotlin.collections.List as ____KtList

public object RosGroup

public val Devicons.Ros: RosGroup
  get() = RosGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RosGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
