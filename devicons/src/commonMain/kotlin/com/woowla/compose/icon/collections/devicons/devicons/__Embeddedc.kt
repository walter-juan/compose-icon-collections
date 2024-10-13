package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.embeddedc.Original
import com.woowla.compose.icon.collections.devicons.devicons.embeddedc.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.embeddedc.Plain
import com.woowla.compose.icon.collections.devicons.devicons.embeddedc.PlainWordmark
import kotlin.collections.List as ____KtList

public object EmbeddedcGroup

public val Devicons.Embeddedc: EmbeddedcGroup
  get() = EmbeddedcGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val EmbeddedcGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
