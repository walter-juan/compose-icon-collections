package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.kdeneon.Original
import com.woowla.compose.icon.collections.devicons.devicons.kdeneon.Plain
import kotlin.collections.List as ____KtList

public object KdeneonGroup

public val Devicons.Kdeneon: KdeneonGroup
  get() = KdeneonGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val KdeneonGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
