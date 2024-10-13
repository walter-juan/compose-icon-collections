package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.nimble.Original
import com.woowla.compose.icon.collections.devicons.devicons.nimble.Plain
import kotlin.collections.List as ____KtList

public object NimbleGroup

public val Devicons.Nimble: NimbleGroup
  get() = NimbleGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NimbleGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
