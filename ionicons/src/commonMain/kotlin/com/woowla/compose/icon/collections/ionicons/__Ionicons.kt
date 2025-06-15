package com.woowla.compose.icon.collections.ionicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.ionicons.ionicons.AllIcons
import com.woowla.compose.icon.collections.ionicons.ionicons.Filled
import com.woowla.compose.icon.collections.ionicons.ionicons.Outline
import com.woowla.compose.icon.collections.ionicons.ionicons.Sharp
import kotlin.collections.List as ____KtList

public object Ionicons

private var __AllIcons: ____KtList<ImageVector>? = null

public val Ionicons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Filled.AllIcons + Sharp.AllIcons + Outline.AllIcons + listOf()
    return __AllIcons!!
  }
