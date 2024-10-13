package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.threejs.Original
import com.woowla.compose.icon.collections.devicons.devicons.threejs.OriginalWordmark
import kotlin.collections.List as ____KtList

public object ThreejsGroup

public val Devicons.Threejs: ThreejsGroup
  get() = ThreejsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ThreejsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
