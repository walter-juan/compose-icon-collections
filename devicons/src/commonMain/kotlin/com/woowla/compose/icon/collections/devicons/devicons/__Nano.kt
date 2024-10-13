package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.nano.Original
import com.woowla.compose.icon.collections.devicons.devicons.nano.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nano.Plain
import com.woowla.compose.icon.collections.devicons.devicons.nano.PlainWordmark
import kotlin.collections.List as ____KtList

public object NanoGroup

public val Devicons.Nano: NanoGroup
  get() = NanoGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NanoGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
