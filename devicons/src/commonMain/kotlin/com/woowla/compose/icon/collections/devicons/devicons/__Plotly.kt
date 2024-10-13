package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.plotly.Original
import com.woowla.compose.icon.collections.devicons.devicons.plotly.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.plotly.Plain
import com.woowla.compose.icon.collections.devicons.devicons.plotly.PlainWordmark
import kotlin.collections.List as ____KtList

public object PlotlyGroup

public val Devicons.Plotly: PlotlyGroup
  get() = PlotlyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PlotlyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
