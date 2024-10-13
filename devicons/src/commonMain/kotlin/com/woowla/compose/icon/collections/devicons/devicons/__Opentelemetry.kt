package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.opentelemetry.Original
import com.woowla.compose.icon.collections.devicons.devicons.opentelemetry.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.opentelemetry.Plain
import com.woowla.compose.icon.collections.devicons.devicons.opentelemetry.PlainWordmark
import kotlin.collections.List as ____KtList

public object OpentelemetryGroup

public val Devicons.Opentelemetry: OpentelemetryGroup
  get() = OpentelemetryGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OpentelemetryGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
