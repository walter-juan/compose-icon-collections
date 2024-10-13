package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.rubymine.Original
import com.woowla.compose.icon.collections.devicons.devicons.rubymine.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.rubymine.Plain
import com.woowla.compose.icon.collections.devicons.devicons.rubymine.PlainWordmark
import kotlin.collections.List as ____KtList

public object RubymineGroup

public val Devicons.Rubymine: RubymineGroup
  get() = RubymineGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RubymineGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
