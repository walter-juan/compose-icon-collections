package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.processing.Original
import com.woowla.compose.icon.collections.devicons.devicons.processing.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.processing.Plain
import com.woowla.compose.icon.collections.devicons.devicons.processing.PlainWordmark
import kotlin.collections.List as ____KtList

public object ProcessingGroup

public val Devicons.Processing: ProcessingGroup
  get() = ProcessingGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ProcessingGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
