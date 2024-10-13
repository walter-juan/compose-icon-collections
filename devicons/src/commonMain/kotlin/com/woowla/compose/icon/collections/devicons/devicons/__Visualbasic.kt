package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.visualbasic.Line
import com.woowla.compose.icon.collections.devicons.devicons.visualbasic.Original
import com.woowla.compose.icon.collections.devicons.devicons.visualbasic.Plain
import kotlin.collections.List as ____KtList

public object VisualbasicGroup

public val Devicons.Visualbasic: VisualbasicGroup
  get() = VisualbasicGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val VisualbasicGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
