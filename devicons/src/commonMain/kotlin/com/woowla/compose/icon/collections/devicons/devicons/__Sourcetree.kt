package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.sourcetree.Original
import com.woowla.compose.icon.collections.devicons.devicons.sourcetree.OriginalWordmark
import kotlin.collections.List as ____KtList

public object SourcetreeGroup

public val Devicons.Sourcetree: SourcetreeGroup
  get() = SourcetreeGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SourcetreeGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
