package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.bun.Line
import com.woowla.compose.icon.collections.devicons.devicons.bun.Original
import com.woowla.compose.icon.collections.devicons.devicons.bun.Plain
import kotlin.collections.List as ____KtList

public object BunGroup

public val Devicons.Bun: BunGroup
  get() = BunGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BunGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
