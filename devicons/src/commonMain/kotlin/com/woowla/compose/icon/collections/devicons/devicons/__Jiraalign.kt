package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.jiraalign.Original
import com.woowla.compose.icon.collections.devicons.devicons.jiraalign.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.jiraalign.Plain
import com.woowla.compose.icon.collections.devicons.devicons.jiraalign.PlainWordmark
import kotlin.collections.List as ____KtList

public object JiraalignGroup

public val Devicons.Jiraalign: JiraalignGroup
  get() = JiraalignGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JiraalignGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
