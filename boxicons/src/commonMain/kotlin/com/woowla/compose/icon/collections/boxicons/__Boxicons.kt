package com.woowla.compose.icon.collections.boxicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.boxicons.boxicons.AllIcons
import com.woowla.compose.icon.collections.boxicons.boxicons.Logos
import com.woowla.compose.icon.collections.boxicons.boxicons.Regular
import com.woowla.compose.icon.collections.boxicons.boxicons.Solid
import kotlin.collections.List as ____KtList

public object Boxicons

private var __AllIcons: ____KtList<ImageVector>? = null

public val Boxicons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Solid.AllIcons + Logos.AllIcons + Regular.AllIcons + listOf()
    return __AllIcons!!
  }
