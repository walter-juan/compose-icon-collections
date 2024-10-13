package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ohmyzsh.Original
import com.woowla.compose.icon.collections.devicons.devicons.ohmyzsh.Plain
import kotlin.collections.List as ____KtList

public object OhmyzshGroup

public val Devicons.Ohmyzsh: OhmyzshGroup
  get() = OhmyzshGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OhmyzshGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
