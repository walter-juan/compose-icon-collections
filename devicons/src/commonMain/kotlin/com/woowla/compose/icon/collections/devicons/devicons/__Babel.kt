package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.babel.Original
import com.woowla.compose.icon.collections.devicons.devicons.babel.Plain
import kotlin.collections.List as ____KtList

public object BabelGroup

public val Devicons.Babel: BabelGroup
  get() = BabelGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BabelGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
