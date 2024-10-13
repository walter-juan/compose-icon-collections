package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.railway.Line
import com.woowla.compose.icon.collections.devicons.devicons.railway.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.railway.Original
import com.woowla.compose.icon.collections.devicons.devicons.railway.OriginalWordmark
import kotlin.collections.List as ____KtList

public object RailwayGroup

public val Devicons.Railway: RailwayGroup
  get() = RailwayGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RailwayGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark)
    return __AllIcons!!
  }
