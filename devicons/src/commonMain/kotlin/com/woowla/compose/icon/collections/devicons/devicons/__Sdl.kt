package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.sdl.Original
import com.woowla.compose.icon.collections.devicons.devicons.sdl.Plain
import kotlin.collections.List as ____KtList

public object SdlGroup

public val Devicons.Sdl: SdlGroup
  get() = SdlGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SdlGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
