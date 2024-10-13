package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.openal.Original
import com.woowla.compose.icon.collections.devicons.devicons.openal.Plain
import kotlin.collections.List as ____KtList

public object OpenalGroup

public val Devicons.Openal: OpenalGroup
  get() = OpenalGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OpenalGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
