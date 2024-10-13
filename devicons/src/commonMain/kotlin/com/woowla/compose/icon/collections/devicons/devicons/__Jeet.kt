package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.jeet.Original
import com.woowla.compose.icon.collections.devicons.devicons.jeet.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.jeet.Plain
import com.woowla.compose.icon.collections.devicons.devicons.jeet.PlainWordmark
import kotlin.collections.List as ____KtList

public object JeetGroup

public val Devicons.Jeet: JeetGroup
  get() = JeetGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JeetGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
