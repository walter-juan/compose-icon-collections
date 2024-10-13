package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.nuget.Original
import com.woowla.compose.icon.collections.devicons.devicons.nuget.OriginalWordmark
import kotlin.collections.List as ____KtList

public object NugetGroup

public val Devicons.Nuget: NugetGroup
  get() = NugetGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NugetGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
