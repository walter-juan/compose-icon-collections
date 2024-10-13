package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.phoenix.Original
import com.woowla.compose.icon.collections.devicons.devicons.phoenix.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.phoenix.PlainWordmark
import kotlin.collections.List as ____KtList

public object PhoenixGroup

public val Devicons.Phoenix: PhoenixGroup
  get() = PhoenixGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PhoenixGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
