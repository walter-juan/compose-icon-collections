package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.bower.Line
import com.woowla.compose.icon.collections.devicons.devicons.bower.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.bower.Original
import com.woowla.compose.icon.collections.devicons.devicons.bower.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.bower.Plain
import com.woowla.compose.icon.collections.devicons.devicons.bower.PlainWordmark
import kotlin.collections.List as ____KtList

public object BowerGroup

public val Devicons.Bower: BowerGroup
  get() = BowerGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BowerGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
