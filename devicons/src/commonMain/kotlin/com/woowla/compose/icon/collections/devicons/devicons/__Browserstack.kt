package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.browserstack.Line
import com.woowla.compose.icon.collections.devicons.devicons.browserstack.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.browserstack.Original
import com.woowla.compose.icon.collections.devicons.devicons.browserstack.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.browserstack.Plain
import com.woowla.compose.icon.collections.devicons.devicons.browserstack.PlainWordmark
import kotlin.collections.List as ____KtList

public object BrowserstackGroup

public val Devicons.Browserstack: BrowserstackGroup
  get() = BrowserstackGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BrowserstackGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
