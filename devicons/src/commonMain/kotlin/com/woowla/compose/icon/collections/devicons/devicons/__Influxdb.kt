package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.influxdb.Original
import com.woowla.compose.icon.collections.devicons.devicons.influxdb.OriginalWordmark
import kotlin.collections.List as ____KtList

public object InfluxdbGroup

public val Devicons.Influxdb: InfluxdbGroup
  get() = InfluxdbGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val InfluxdbGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
