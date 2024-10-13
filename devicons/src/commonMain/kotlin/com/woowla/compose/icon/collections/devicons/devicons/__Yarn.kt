package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.yarn.Line
import com.woowla.compose.icon.collections.devicons.devicons.yarn.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.yarn.Original
import com.woowla.compose.icon.collections.devicons.devicons.yarn.OriginalWordmark
import kotlin.collections.List as ____KtList

public object YarnGroup

public val Devicons.Yarn: YarnGroup
  get() = YarnGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val YarnGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark)
    return __AllIcons!!
  }
