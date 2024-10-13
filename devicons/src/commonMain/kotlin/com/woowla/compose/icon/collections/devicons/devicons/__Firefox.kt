package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.firefox.Original
import com.woowla.compose.icon.collections.devicons.devicons.firefox.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.firefox.Plain
import com.woowla.compose.icon.collections.devicons.devicons.firefox.PlainWordmark
import kotlin.collections.List as ____KtList

public object FirefoxGroup

public val Devicons.Firefox: FirefoxGroup
  get() = FirefoxGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FirefoxGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
