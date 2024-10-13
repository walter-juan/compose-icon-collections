package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.spring.Original
import com.woowla.compose.icon.collections.devicons.devicons.spring.OriginalWordmark
import kotlin.collections.List as ____KtList

public object SpringGroup

public val Devicons.Spring: SpringGroup
  get() = SpringGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SpringGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
