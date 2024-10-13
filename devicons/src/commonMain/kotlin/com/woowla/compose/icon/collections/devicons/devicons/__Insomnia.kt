package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.insomnia.Original
import com.woowla.compose.icon.collections.devicons.devicons.insomnia.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.insomnia.Plain
import com.woowla.compose.icon.collections.devicons.devicons.insomnia.PlainWordmark
import kotlin.collections.List as ____KtList

public object InsomniaGroup

public val Devicons.Insomnia: InsomniaGroup
  get() = InsomniaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val InsomniaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
