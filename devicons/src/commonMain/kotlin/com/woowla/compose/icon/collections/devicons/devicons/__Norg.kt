package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.norg.Original
import com.woowla.compose.icon.collections.devicons.devicons.norg.Plain
import kotlin.collections.List as ____KtList

public object NorgGroup

public val Devicons.Norg: NorgGroup
  get() = NorgGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NorgGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
