package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.html5.Original
import com.woowla.compose.icon.collections.devicons.devicons.html5.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.html5.Plain
import com.woowla.compose.icon.collections.devicons.devicons.html5.PlainWordmark
import kotlin.collections.List as ____KtList

public object Html5Group

public val Devicons.Html5: Html5Group
  get() = Html5Group

private var __AllIcons: ____KtList<ImageVector>? = null

public val Html5Group.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
