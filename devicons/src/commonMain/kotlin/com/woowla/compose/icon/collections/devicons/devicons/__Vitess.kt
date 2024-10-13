package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.vitess.Original
import com.woowla.compose.icon.collections.devicons.devicons.vitess.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.vitess.Plain
import com.woowla.compose.icon.collections.devicons.devicons.vitess.PlainWordmark
import kotlin.collections.List as ____KtList

public object VitessGroup

public val Devicons.Vitess: VitessGroup
  get() = VitessGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val VitessGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
