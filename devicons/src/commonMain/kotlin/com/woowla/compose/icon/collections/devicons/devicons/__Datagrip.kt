package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.datagrip.Original
import com.woowla.compose.icon.collections.devicons.devicons.datagrip.Plain
import com.woowla.compose.icon.collections.devicons.devicons.datagrip.PlainWordmark
import kotlin.collections.List as ____KtList

public object DatagripGroup

public val Devicons.Datagrip: DatagripGroup
  get() = DatagripGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DatagripGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain, PlainWordmark)
    return __AllIcons!!
  }
