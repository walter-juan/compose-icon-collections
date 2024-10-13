package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.rollup.Line
import com.woowla.compose.icon.collections.devicons.devicons.rollup.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.rollup.Original
import com.woowla.compose.icon.collections.devicons.devicons.rollup.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.rollup.Plain
import com.woowla.compose.icon.collections.devicons.devicons.rollup.PlainWordmark
import kotlin.collections.List as ____KtList

public object RollupGroup

public val Devicons.Rollup: RollupGroup
  get() = RollupGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RollupGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
