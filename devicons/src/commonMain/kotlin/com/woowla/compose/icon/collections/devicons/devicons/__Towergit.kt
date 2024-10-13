package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.towergit.Original
import com.woowla.compose.icon.collections.devicons.devicons.towergit.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.towergit.Plain
import com.woowla.compose.icon.collections.devicons.devicons.towergit.PlainWordmark
import kotlin.collections.List as ____KtList

public object TowergitGroup

public val Devicons.Towergit: TowergitGroup
  get() = TowergitGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TowergitGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
