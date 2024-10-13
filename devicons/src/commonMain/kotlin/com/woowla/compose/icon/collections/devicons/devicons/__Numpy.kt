package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.numpy.Line
import com.woowla.compose.icon.collections.devicons.devicons.numpy.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.numpy.Original
import com.woowla.compose.icon.collections.devicons.devicons.numpy.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.numpy.Plain
import com.woowla.compose.icon.collections.devicons.devicons.numpy.PlainWordmark
import kotlin.collections.List as ____KtList

public object NumpyGroup

public val Devicons.Numpy: NumpyGroup
  get() = NumpyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NumpyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
