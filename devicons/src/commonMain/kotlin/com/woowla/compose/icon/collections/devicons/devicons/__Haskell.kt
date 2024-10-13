package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.haskell.Original
import com.woowla.compose.icon.collections.devicons.devicons.haskell.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.haskell.Plain
import com.woowla.compose.icon.collections.devicons.devicons.haskell.PlainWordmark
import kotlin.collections.List as ____KtList

public object HaskellGroup

public val Devicons.Haskell: HaskellGroup
  get() = HaskellGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val HaskellGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
