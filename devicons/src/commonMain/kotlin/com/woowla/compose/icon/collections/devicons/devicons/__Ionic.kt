package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ionic.Original
import com.woowla.compose.icon.collections.devicons.devicons.ionic.OriginalWordmark
import kotlin.collections.List as ____KtList

public object IonicGroup

public val Devicons.Ionic: IonicGroup
  get() = IonicGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val IonicGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
