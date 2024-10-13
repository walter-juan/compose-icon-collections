package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.sketch.Line
import com.woowla.compose.icon.collections.devicons.devicons.sketch.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.sketch.Original
import com.woowla.compose.icon.collections.devicons.devicons.sketch.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.sketch.Plain
import com.woowla.compose.icon.collections.devicons.devicons.sketch.PlainWordmark
import kotlin.collections.List as ____KtList

public object SketchGroup

public val Devicons.Sketch: SketchGroup
  get() = SketchGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SketchGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
