package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.moleculer.Original
import com.woowla.compose.icon.collections.devicons.devicons.moleculer.OriginalWordmark
import kotlin.collections.List as ____KtList

public object MoleculerGroup

public val Devicons.Moleculer: MoleculerGroup
  get() = MoleculerGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MoleculerGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
