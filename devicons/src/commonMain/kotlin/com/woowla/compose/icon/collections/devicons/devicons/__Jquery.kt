package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.jquery.Original
import com.woowla.compose.icon.collections.devicons.devicons.jquery.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.jquery.Plain
import com.woowla.compose.icon.collections.devicons.devicons.jquery.PlainWordmark
import kotlin.collections.List as ____KtList

public object JqueryGroup

public val Devicons.Jquery: JqueryGroup
  get() = JqueryGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JqueryGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
