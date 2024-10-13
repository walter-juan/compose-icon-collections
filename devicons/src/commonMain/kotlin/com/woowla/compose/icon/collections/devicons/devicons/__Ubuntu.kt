package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ubuntu.Original
import com.woowla.compose.icon.collections.devicons.devicons.ubuntu.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.ubuntu.Plain
import com.woowla.compose.icon.collections.devicons.devicons.ubuntu.PlainWordmark
import kotlin.collections.List as ____KtList

public object UbuntuGroup

public val Devicons.Ubuntu: UbuntuGroup
  get() = UbuntuGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val UbuntuGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
