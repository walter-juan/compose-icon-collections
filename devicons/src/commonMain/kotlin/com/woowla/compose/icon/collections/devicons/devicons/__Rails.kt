package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.rails.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.rails.Plain
import com.woowla.compose.icon.collections.devicons.devicons.rails.PlainWordmark
import kotlin.collections.List as ____KtList

public object RailsGroup

public val Devicons.Rails: RailsGroup
  get() = RailsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RailsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
