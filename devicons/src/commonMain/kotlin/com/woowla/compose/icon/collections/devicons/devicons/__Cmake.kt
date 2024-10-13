package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.cmake.Original
import com.woowla.compose.icon.collections.devicons.devicons.cmake.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.cmake.Plain
import com.woowla.compose.icon.collections.devicons.devicons.cmake.PlainWordmark
import kotlin.collections.List as ____KtList

public object CmakeGroup

public val Devicons.Cmake: CmakeGroup
  get() = CmakeGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CmakeGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
