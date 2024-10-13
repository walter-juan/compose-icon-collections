package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.pandas.Line
import com.woowla.compose.icon.collections.devicons.devicons.pandas.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.pandas.Original
import com.woowla.compose.icon.collections.devicons.devicons.pandas.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.pandas.Plain
import com.woowla.compose.icon.collections.devicons.devicons.pandas.PlainWordmark
import kotlin.collections.List as ____KtList

public object PandasGroup

public val Devicons.Pandas: PandasGroup
  get() = PandasGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PandasGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
