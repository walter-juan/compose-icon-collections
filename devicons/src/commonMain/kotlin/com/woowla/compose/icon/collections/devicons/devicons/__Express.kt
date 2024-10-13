package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.express.Original
import com.woowla.compose.icon.collections.devicons.devicons.express.OriginalWordmark
import kotlin.collections.List as ____KtList

public object ExpressGroup

public val Devicons.Express: ExpressGroup
  get() = ExpressGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ExpressGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
