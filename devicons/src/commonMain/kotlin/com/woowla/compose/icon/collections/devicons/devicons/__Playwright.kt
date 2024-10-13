package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.playwright.Original
import com.woowla.compose.icon.collections.devicons.devicons.playwright.Plain
import kotlin.collections.List as ____KtList

public object PlaywrightGroup

public val Devicons.Playwright: PlaywrightGroup
  get() = PlaywrightGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PlaywrightGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
