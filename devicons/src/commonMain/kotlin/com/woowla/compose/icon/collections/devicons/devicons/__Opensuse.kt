package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.opensuse.Original
import com.woowla.compose.icon.collections.devicons.devicons.opensuse.OriginalWordmark
import kotlin.collections.List as ____KtList

public object OpensuseGroup

public val Devicons.Opensuse: OpensuseGroup
  get() = OpensuseGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OpensuseGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
