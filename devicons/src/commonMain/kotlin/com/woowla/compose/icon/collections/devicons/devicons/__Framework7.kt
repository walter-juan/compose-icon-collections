package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.framework7.Original
import com.woowla.compose.icon.collections.devicons.devicons.framework7.OriginalWordmark
import kotlin.collections.List as ____KtList

public object Framework7Group

public val Devicons.Framework7: Framework7Group
  get() = Framework7Group

private var __AllIcons: ____KtList<ImageVector>? = null

public val Framework7Group.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
