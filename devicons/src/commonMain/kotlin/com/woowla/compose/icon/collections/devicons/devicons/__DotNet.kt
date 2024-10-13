package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.dotnet.DotNetOriginal
import com.woowla.compose.icon.collections.devicons.devicons.dotnet.DotNetOriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.dotnet.DotNetPlain
import com.woowla.compose.icon.collections.devicons.devicons.dotnet.DotNetPlainWordmark
import kotlin.collections.List as ____KtList

public object DotNetGroup

public val Devicons.DotNet: DotNetGroup
  get() = DotNetGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DotNetGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(DotNetOriginal, DotNetOriginalWordmark, DotNetPlain, DotNetPlainWordmark)
    return __AllIcons!!
  }
