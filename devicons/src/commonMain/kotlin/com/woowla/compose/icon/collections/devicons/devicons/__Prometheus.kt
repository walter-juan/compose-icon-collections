package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.prometheus.Line
import com.woowla.compose.icon.collections.devicons.devicons.prometheus.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.prometheus.Original
import com.woowla.compose.icon.collections.devicons.devicons.prometheus.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.prometheus.PlainWordmark
import kotlin.collections.List as ____KtList

public object PrometheusGroup

public val Devicons.Prometheus: PrometheusGroup
  get() = PrometheusGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PrometheusGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
