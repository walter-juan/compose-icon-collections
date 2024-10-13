package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.atom.Original
import com.woowla.compose.icon.collections.devicons.devicons.atom.OriginalWordmark
import kotlin.collections.List as ____KtList

public object AtomGroup

public val Devicons.Atom: AtomGroup
  get() = AtomGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AtomGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
