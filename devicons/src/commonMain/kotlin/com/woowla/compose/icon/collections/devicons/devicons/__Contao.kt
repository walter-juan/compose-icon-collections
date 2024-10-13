package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.contao.Original
import com.woowla.compose.icon.collections.devicons.devicons.contao.OriginalWordmark
import kotlin.collections.List as ____KtList

public object ContaoGroup

public val Devicons.Contao: ContaoGroup
  get() = ContaoGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ContaoGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
