package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.gitter.Plain
import com.woowla.compose.icon.collections.devicons.devicons.gitter.PlainWordmark
import kotlin.collections.List as ____KtList

public object GitterGroup

public val Devicons.Gitter: GitterGroup
  get() = GitterGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GitterGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Plain, PlainWordmark)
    return __AllIcons!!
  }
