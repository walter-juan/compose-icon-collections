package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.r.Line
import com.woowla.compose.icon.collections.devicons.devicons.r.Original
import com.woowla.compose.icon.collections.devicons.devicons.r.Plain
import kotlin.collections.List as ____KtList

public object RGroup

public val Devicons.R: RGroup
  get() = RGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
