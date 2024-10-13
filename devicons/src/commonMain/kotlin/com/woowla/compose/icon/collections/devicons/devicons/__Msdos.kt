package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.msdos.Line
import com.woowla.compose.icon.collections.devicons.devicons.msdos.Original
import com.woowla.compose.icon.collections.devicons.devicons.msdos.Plain
import kotlin.collections.List as ____KtList

public object MsdosGroup

public val Devicons.Msdos: MsdosGroup
  get() = MsdosGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MsdosGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
