package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.electron.Original
import com.woowla.compose.icon.collections.devicons.devicons.electron.OriginalWordmark
import kotlin.collections.List as ____KtList

public object ElectronGroup

public val Devicons.Electron: ElectronGroup
  get() = ElectronGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ElectronGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
