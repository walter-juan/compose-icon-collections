package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.readthedocs.Line
import com.woowla.compose.icon.collections.devicons.devicons.readthedocs.Original
import com.woowla.compose.icon.collections.devicons.devicons.readthedocs.OriginalWordmark
import kotlin.collections.List as ____KtList

public object ReadthedocsGroup

public val Devicons.Readthedocs: ReadthedocsGroup
  get() = ReadthedocsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ReadthedocsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, OriginalWordmark)
    return __AllIcons!!
  }
