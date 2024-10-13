package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.fsharp.Original
import com.woowla.compose.icon.collections.devicons.devicons.fsharp.Plain
import kotlin.collections.List as ____KtList

public object FsharpGroup

public val Devicons.Fsharp: FsharpGroup
  get() = FsharpGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FsharpGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
