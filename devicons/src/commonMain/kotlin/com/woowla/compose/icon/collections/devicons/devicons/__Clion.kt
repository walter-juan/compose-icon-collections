package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.clion.Original
import com.woowla.compose.icon.collections.devicons.devicons.clion.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.clion.Plain
import com.woowla.compose.icon.collections.devicons.devicons.clion.PlainWordmark
import kotlin.collections.List as ____KtList

public object ClionGroup

public val Devicons.Clion: ClionGroup
  get() = ClionGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ClionGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
