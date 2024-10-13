package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.css3.Original
import com.woowla.compose.icon.collections.devicons.devicons.css3.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.css3.Plain
import com.woowla.compose.icon.collections.devicons.devicons.css3.PlainWordmark
import kotlin.collections.List as ____KtList

public object Css3Group

public val Devicons.Css3: Css3Group
  get() = Css3Group

private var __AllIcons: ____KtList<ImageVector>? = null

public val Css3Group.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
