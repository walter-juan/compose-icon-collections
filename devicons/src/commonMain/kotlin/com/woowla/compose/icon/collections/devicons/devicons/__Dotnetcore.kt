package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.dotnetcore.Original
import com.woowla.compose.icon.collections.devicons.devicons.dotnetcore.Plain
import kotlin.collections.List as ____KtList

public object DotnetcoreGroup

public val Devicons.Dotnetcore: DotnetcoreGroup
  get() = DotnetcoreGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DotnetcoreGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
