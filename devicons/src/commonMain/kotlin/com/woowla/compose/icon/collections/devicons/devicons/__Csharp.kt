package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.csharp.Line
import com.woowla.compose.icon.collections.devicons.devicons.csharp.Original
import com.woowla.compose.icon.collections.devicons.devicons.csharp.Plain
import kotlin.collections.List as ____KtList

public object CsharpGroup

public val Devicons.Csharp: CsharpGroup
  get() = CsharpGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CsharpGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
