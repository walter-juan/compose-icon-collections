package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.coffeescript.Original
import com.woowla.compose.icon.collections.devicons.devicons.coffeescript.OriginalWordmark
import kotlin.collections.List as ____KtList

public object CoffeescriptGroup

public val Devicons.Coffeescript: CoffeescriptGroup
  get() = CoffeescriptGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CoffeescriptGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
