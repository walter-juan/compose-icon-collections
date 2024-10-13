package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.opera.Original
import com.woowla.compose.icon.collections.devicons.devicons.opera.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.opera.Plain
import com.woowla.compose.icon.collections.devicons.devicons.opera.PlainWordmark
import kotlin.collections.List as ____KtList

public object OperaGroup

public val Devicons.Opera: OperaGroup
  get() = OperaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OperaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
