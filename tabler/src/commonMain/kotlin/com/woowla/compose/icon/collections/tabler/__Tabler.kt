package com.woowla.compose.icon.collections.tabler

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.tabler.tabler.AllIcons
import com.woowla.compose.icon.collections.tabler.tabler.Filled
import com.woowla.compose.icon.collections.tabler.tabler.Outline
import kotlin.collections.List as ____KtList

public object Tabler

private var __AllIcons: ____KtList<ImageVector>? = null

public val Tabler.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Filled.AllIcons + Outline.AllIcons + listOf()
    return __AllIcons!!
  }
