package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.algolia.Original
import com.woowla.compose.icon.collections.devicons.devicons.algolia.OriginalWordmark
import kotlin.collections.List as ____KtList

public object AlgoliaGroup

public val Devicons.Algolia: AlgoliaGroup
  get() = AlgoliaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AlgoliaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
