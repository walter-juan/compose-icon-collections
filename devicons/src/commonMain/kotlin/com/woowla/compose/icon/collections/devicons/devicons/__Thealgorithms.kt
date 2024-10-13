package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.thealgorithms.Original
import com.woowla.compose.icon.collections.devicons.devicons.thealgorithms.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.thealgorithms.Plain
import com.woowla.compose.icon.collections.devicons.devicons.thealgorithms.PlainWordmark
import kotlin.collections.List as ____KtList

public object ThealgorithmsGroup

public val Devicons.Thealgorithms: ThealgorithmsGroup
  get() = ThealgorithmsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ThealgorithmsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
