package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.awk.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.awk.PlainWordmark
import kotlin.collections.List as ____KtList

public object AwkGroup

public val Devicons.Awk: AwkGroup
  get() = AwkGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AwkGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
