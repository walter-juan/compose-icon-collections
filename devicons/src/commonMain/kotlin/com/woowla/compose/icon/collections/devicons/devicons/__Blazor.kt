package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.blazor.Line
import com.woowla.compose.icon.collections.devicons.devicons.blazor.Original
import kotlin.collections.List as ____KtList

public object BlazorGroup

public val Devicons.Blazor: BlazorGroup
  get() = BlazorGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BlazorGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original)
    return __AllIcons!!
  }
