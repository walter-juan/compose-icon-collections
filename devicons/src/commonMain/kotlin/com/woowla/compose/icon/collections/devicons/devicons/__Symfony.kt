package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.symfony.Original
import com.woowla.compose.icon.collections.devicons.devicons.symfony.OriginalWordmark
import kotlin.collections.List as ____KtList

public object SymfonyGroup

public val Devicons.Symfony: SymfonyGroup
  get() = SymfonyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SymfonyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
