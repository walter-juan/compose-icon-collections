package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.goland.Original
import com.woowla.compose.icon.collections.devicons.devicons.goland.Plain
import com.woowla.compose.icon.collections.devicons.devicons.goland.PlainWordmark
import kotlin.collections.List as ____KtList

public object GolandGroup

public val Devicons.Goland: GolandGroup
  get() = GolandGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GolandGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain, PlainWordmark)
    return __AllIcons!!
  }
