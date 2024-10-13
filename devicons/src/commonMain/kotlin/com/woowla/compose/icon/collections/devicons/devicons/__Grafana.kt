package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.grafana.Line
import com.woowla.compose.icon.collections.devicons.devicons.grafana.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.grafana.Original
import com.woowla.compose.icon.collections.devicons.devicons.grafana.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.grafana.Plain
import com.woowla.compose.icon.collections.devicons.devicons.grafana.PlainWordmark
import kotlin.collections.List as ____KtList

public object GrafanaGroup

public val Devicons.Grafana: GrafanaGroup
  get() = GrafanaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GrafanaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
