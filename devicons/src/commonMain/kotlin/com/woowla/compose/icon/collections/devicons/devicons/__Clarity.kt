package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.clarity.Original
import com.woowla.compose.icon.collections.devicons.devicons.clarity.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.clarity.Plain
import com.woowla.compose.icon.collections.devicons.devicons.clarity.PlainWordmark
import kotlin.collections.List as ____KtList

public object ClarityGroup

public val Devicons.Clarity: ClarityGroup
  get() = ClarityGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ClarityGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
