package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.pyscript.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.pyscript.PlainWordmark
import kotlin.collections.List as ____KtList

public object PyscriptGroup

public val Devicons.Pyscript: PyscriptGroup
  get() = PyscriptGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PyscriptGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
