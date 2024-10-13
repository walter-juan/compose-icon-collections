package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.stackoverflow.Line
import com.woowla.compose.icon.collections.devicons.devicons.stackoverflow.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.stackoverflow.Original
import com.woowla.compose.icon.collections.devicons.devicons.stackoverflow.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.stackoverflow.Plain
import com.woowla.compose.icon.collections.devicons.devicons.stackoverflow.PlainWordmark
import kotlin.collections.List as ____KtList

public object StackoverflowGroup

public val Devicons.Stackoverflow: StackoverflowGroup
  get() = StackoverflowGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val StackoverflowGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
