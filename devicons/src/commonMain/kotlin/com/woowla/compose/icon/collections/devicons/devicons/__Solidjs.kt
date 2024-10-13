package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.solidjs.Original
import com.woowla.compose.icon.collections.devicons.devicons.solidjs.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.solidjs.Plain
import com.woowla.compose.icon.collections.devicons.devicons.solidjs.PlainWordmark
import kotlin.collections.List as ____KtList

public object SolidjsGroup

public val Devicons.Solidjs: SolidjsGroup
  get() = SolidjsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SolidjsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
