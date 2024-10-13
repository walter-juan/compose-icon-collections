package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.vitest.Original
import com.woowla.compose.icon.collections.devicons.devicons.vitest.Plain
import kotlin.collections.List as ____KtList

public object VitestGroup

public val Devicons.Vitest: VitestGroup
  get() = VitestGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val VitestGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
