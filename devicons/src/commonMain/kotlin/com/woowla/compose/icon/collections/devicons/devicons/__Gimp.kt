package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.gimp.Line
import com.woowla.compose.icon.collections.devicons.devicons.gimp.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.gimp.Original
import com.woowla.compose.icon.collections.devicons.devicons.gimp.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.gimp.Plain
import com.woowla.compose.icon.collections.devicons.devicons.gimp.PlainWordmark
import kotlin.collections.List as ____KtList

public object GimpGroup

public val Devicons.Gimp: GimpGroup
  get() = GimpGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GimpGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
