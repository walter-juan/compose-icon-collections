package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.astro.Original
import com.woowla.compose.icon.collections.devicons.devicons.astro.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.astro.Plain
import com.woowla.compose.icon.collections.devicons.devicons.astro.PlainWordmark
import kotlin.collections.List as ____KtList

public object AstroGroup

public val Devicons.Astro: AstroGroup
  get() = AstroGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AstroGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
