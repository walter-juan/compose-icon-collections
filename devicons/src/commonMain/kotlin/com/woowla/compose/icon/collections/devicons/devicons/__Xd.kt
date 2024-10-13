package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.xd.Line
import com.woowla.compose.icon.collections.devicons.devicons.xd.Original
import com.woowla.compose.icon.collections.devicons.devicons.xd.Plain
import kotlin.collections.List as ____KtList

public object XdGroup

public val Devicons.Xd: XdGroup
  get() = XdGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val XdGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
