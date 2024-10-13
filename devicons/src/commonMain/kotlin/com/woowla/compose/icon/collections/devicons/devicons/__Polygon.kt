package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.polygon.Original
import com.woowla.compose.icon.collections.devicons.devicons.polygon.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.polygon.Plain
import com.woowla.compose.icon.collections.devicons.devicons.polygon.PlainWordmark
import kotlin.collections.List as ____KtList

public object PolygonGroup

public val Devicons.Polygon: PolygonGroup
  get() = PolygonGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PolygonGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
