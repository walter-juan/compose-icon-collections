package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.modx.Original
import com.woowla.compose.icon.collections.devicons.devicons.modx.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.modx.Plain
import com.woowla.compose.icon.collections.devicons.devicons.modx.PlainWordmark
import kotlin.collections.List as ____KtList

public object ModxGroup

public val Devicons.Modx: ModxGroup
  get() = ModxGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ModxGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
