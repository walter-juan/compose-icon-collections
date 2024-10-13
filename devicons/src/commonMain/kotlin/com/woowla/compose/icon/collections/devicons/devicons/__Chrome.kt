package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.chrome.Original
import com.woowla.compose.icon.collections.devicons.devicons.chrome.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.chrome.Plain
import com.woowla.compose.icon.collections.devicons.devicons.chrome.PlainWordmark
import kotlin.collections.List as ____KtList

public object ChromeGroup

public val Devicons.Chrome: ChromeGroup
  get() = ChromeGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ChromeGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
