package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.logstash.Original
import com.woowla.compose.icon.collections.devicons.devicons.logstash.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.logstash.Plain
import com.woowla.compose.icon.collections.devicons.devicons.logstash.PlainWordmark
import kotlin.collections.List as ____KtList

public object LogstashGroup

public val Devicons.Logstash: LogstashGroup
  get() = LogstashGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val LogstashGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
