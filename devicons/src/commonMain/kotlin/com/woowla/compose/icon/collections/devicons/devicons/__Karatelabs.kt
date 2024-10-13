package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.karatelabs.Original
import com.woowla.compose.icon.collections.devicons.devicons.karatelabs.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.karatelabs.Plain
import com.woowla.compose.icon.collections.devicons.devicons.karatelabs.PlainWordmark
import kotlin.collections.List as ____KtList

public object KaratelabsGroup

public val Devicons.Karatelabs: KaratelabsGroup
  get() = KaratelabsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val KaratelabsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
