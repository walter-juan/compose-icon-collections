package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.matlab.Line
import com.woowla.compose.icon.collections.devicons.devicons.matlab.Original
import com.woowla.compose.icon.collections.devicons.devicons.matlab.Plain
import kotlin.collections.List as ____KtList

public object MatlabGroup

public val Devicons.Matlab: MatlabGroup
  get() = MatlabGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MatlabGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
