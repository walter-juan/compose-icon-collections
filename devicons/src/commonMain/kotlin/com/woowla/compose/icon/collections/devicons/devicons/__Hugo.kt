package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.hugo.Original
import com.woowla.compose.icon.collections.devicons.devicons.hugo.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.hugo.Plain
import com.woowla.compose.icon.collections.devicons.devicons.hugo.PlainWordmark
import kotlin.collections.List as ____KtList

public object HugoGroup

public val Devicons.Hugo: HugoGroup
  get() = HugoGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val HugoGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
