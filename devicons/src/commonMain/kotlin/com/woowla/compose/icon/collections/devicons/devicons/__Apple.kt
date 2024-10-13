package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.apple.Original
import kotlin.collections.List as ____KtList

public object AppleGroup

public val Devicons.Apple: AppleGroup
  get() = AppleGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AppleGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original)
    return __AllIcons!!
  }
