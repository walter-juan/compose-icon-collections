package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.linux.Original
import com.woowla.compose.icon.collections.devicons.devicons.linux.Plain
import kotlin.collections.List as ____KtList

public object LinuxGroup

public val Devicons.Linux: LinuxGroup
  get() = LinuxGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val LinuxGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
