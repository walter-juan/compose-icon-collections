package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.portainer.Original
import com.woowla.compose.icon.collections.devicons.devicons.portainer.OriginalWordmark
import kotlin.collections.List as ____KtList

public object PortainerGroup

public val Devicons.Portainer: PortainerGroup
  get() = PortainerGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PortainerGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
