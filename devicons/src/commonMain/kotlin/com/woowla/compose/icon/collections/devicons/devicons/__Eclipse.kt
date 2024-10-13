package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.eclipse.Original
import com.woowla.compose.icon.collections.devicons.devicons.eclipse.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.eclipse.Plain
import com.woowla.compose.icon.collections.devicons.devicons.eclipse.PlainWordmark
import kotlin.collections.List as ____KtList

public object EclipseGroup

public val Devicons.Eclipse: EclipseGroup
  get() = EclipseGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val EclipseGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
