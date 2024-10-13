package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.harvester.Original
import com.woowla.compose.icon.collections.devicons.devicons.harvester.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.harvester.PlainWordmark
import kotlin.collections.List as ____KtList

public object HarvesterGroup

public val Devicons.Harvester: HarvesterGroup
  get() = HarvesterGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val HarvesterGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
