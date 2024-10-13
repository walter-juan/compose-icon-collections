package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.cplusplus.Line
import com.woowla.compose.icon.collections.devicons.devicons.cplusplus.Original
import com.woowla.compose.icon.collections.devicons.devicons.cplusplus.Plain
import kotlin.collections.List as ____KtList

public object CplusplusGroup

public val Devicons.Cplusplus: CplusplusGroup
  get() = CplusplusGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CplusplusGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
