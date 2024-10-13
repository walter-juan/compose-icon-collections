package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.labview.Original
import com.woowla.compose.icon.collections.devicons.devicons.labview.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.labview.Plain
import com.woowla.compose.icon.collections.devicons.devicons.labview.PlainWordmark
import kotlin.collections.List as ____KtList

public object LabviewGroup

public val Devicons.Labview: LabviewGroup
  get() = LabviewGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val LabviewGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
