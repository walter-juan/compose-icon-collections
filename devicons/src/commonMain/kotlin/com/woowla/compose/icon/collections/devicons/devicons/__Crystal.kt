package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.crystal.Line
import com.woowla.compose.icon.collections.devicons.devicons.crystal.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.crystal.Original
import com.woowla.compose.icon.collections.devicons.devicons.crystal.OriginalWordmark
import kotlin.collections.List as ____KtList

public object CrystalGroup

public val Devicons.Crystal: CrystalGroup
  get() = CrystalGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CrystalGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark)
    return __AllIcons!!
  }
