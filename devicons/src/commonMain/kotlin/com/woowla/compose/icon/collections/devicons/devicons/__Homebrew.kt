package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.homebrew.Line
import com.woowla.compose.icon.collections.devicons.devicons.homebrew.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.homebrew.Original
import com.woowla.compose.icon.collections.devicons.devicons.homebrew.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.homebrew.Plain
import com.woowla.compose.icon.collections.devicons.devicons.homebrew.PlainWordmark
import kotlin.collections.List as ____KtList

public object HomebrewGroup

public val Devicons.Homebrew: HomebrewGroup
  get() = HomebrewGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val HomebrewGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
