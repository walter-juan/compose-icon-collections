package com.woowla.compose.icon.collections.heroicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.heroicons.heroicons.AllIcons
import com.woowla.compose.icon.collections.heroicons.heroicons.Outline
import com.woowla.compose.icon.collections.heroicons.heroicons.Solid
import kotlin.collections.List as ____KtList

public object Heroicons

private var __AllIcons: ____KtList<ImageVector>? = null

public val Heroicons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Solid.AllIcons + Outline.AllIcons + listOf()
    return __AllIcons!!
  }
