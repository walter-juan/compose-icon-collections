package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.safari.Line
import com.woowla.compose.icon.collections.devicons.devicons.safari.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.safari.Original
import com.woowla.compose.icon.collections.devicons.devicons.safari.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.safari.Plain
import com.woowla.compose.icon.collections.devicons.devicons.safari.PlainWordmark
import kotlin.collections.List as ____KtList

public object SafariGroup

public val Devicons.Safari: SafariGroup
  get() = SafariGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SafariGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
