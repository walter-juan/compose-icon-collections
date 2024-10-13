package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.carbon.Original
import kotlin.collections.List as ____KtList

public object CarbonGroup

public val Devicons.Carbon: CarbonGroup
  get() = CarbonGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CarbonGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original)
    return __AllIcons!!
  }
