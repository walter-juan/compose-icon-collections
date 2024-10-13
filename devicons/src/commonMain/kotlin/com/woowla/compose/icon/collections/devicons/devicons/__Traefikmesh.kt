package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.traefikmesh.Line
import com.woowla.compose.icon.collections.devicons.devicons.traefikmesh.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.traefikmesh.Original
import com.woowla.compose.icon.collections.devicons.devicons.traefikmesh.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.traefikmesh.PlainWordmark
import kotlin.collections.List as ____KtList

public object TraefikmeshGroup

public val Devicons.Traefikmesh: TraefikmeshGroup
  get() = TraefikmeshGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TraefikmeshGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
