package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.c.Line
import com.woowla.compose.icon.collections.devicons.devicons.c.Original
import com.woowla.compose.icon.collections.devicons.devicons.c.Plain
import kotlin.collections.List as ____KtList

public object CGroup

public val Devicons.C: CGroup
  get() = CGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
