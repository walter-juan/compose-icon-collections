package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.splunk.OriginalWordmark
import kotlin.collections.List as ____KtList

public object SplunkGroup

public val Devicons.Splunk: SplunkGroup
  get() = SplunkGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SplunkGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(OriginalWordmark)
    return __AllIcons!!
  }
