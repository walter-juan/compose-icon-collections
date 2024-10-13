package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.jamstack.Original
import com.woowla.compose.icon.collections.devicons.devicons.jamstack.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.jamstack.PlainWordmark
import kotlin.collections.List as ____KtList

public object JamstackGroup

public val Devicons.Jamstack: JamstackGroup
  get() = JamstackGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JamstackGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
