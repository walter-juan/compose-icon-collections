package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.subversion.Original
import com.woowla.compose.icon.collections.devicons.devicons.subversion.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.subversion.PlainWordmark
import kotlin.collections.List as ____KtList

public object SubversionGroup

public val Devicons.Subversion: SubversionGroup
  get() = SubversionGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SubversionGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
