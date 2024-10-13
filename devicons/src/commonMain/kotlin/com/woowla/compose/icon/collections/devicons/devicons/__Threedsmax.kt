package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.threedsmax.Original
import com.woowla.compose.icon.collections.devicons.devicons.threedsmax.Plain
import kotlin.collections.List as ____KtList

public object ThreedsmaxGroup

public val Devicons.Threedsmax: ThreedsmaxGroup
  get() = ThreedsmaxGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ThreedsmaxGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
