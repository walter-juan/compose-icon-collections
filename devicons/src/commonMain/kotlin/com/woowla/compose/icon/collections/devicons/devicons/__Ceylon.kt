package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ceylon.Original
import com.woowla.compose.icon.collections.devicons.devicons.ceylon.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.ceylon.Plain
import com.woowla.compose.icon.collections.devicons.devicons.ceylon.PlainWordmark
import kotlin.collections.List as ____KtList

public object CeylonGroup

public val Devicons.Ceylon: CeylonGroup
  get() = CeylonGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CeylonGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
