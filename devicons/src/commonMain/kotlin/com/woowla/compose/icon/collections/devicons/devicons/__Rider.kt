package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.rider.Original
import com.woowla.compose.icon.collections.devicons.devicons.rider.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.rider.Plain
import com.woowla.compose.icon.collections.devicons.devicons.rider.PlainWordmark
import kotlin.collections.List as ____KtList

public object RiderGroup

public val Devicons.Rider: RiderGroup
  get() = RiderGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RiderGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
