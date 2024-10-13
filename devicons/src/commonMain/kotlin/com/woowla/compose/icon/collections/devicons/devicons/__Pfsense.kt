package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.pfsense.Original
import com.woowla.compose.icon.collections.devicons.devicons.pfsense.OriginalWordmark
import kotlin.collections.List as ____KtList

public object PfsenseGroup

public val Devicons.Pfsense: PfsenseGroup
  get() = PfsenseGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PfsenseGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
