package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.codepen.Line
import com.woowla.compose.icon.collections.devicons.devicons.codepen.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.codepen.Original
import com.woowla.compose.icon.collections.devicons.devicons.codepen.OriginalWordmark
import kotlin.collections.List as ____KtList

public object CodepenGroup

public val Devicons.Codepen: CodepenGroup
  get() = CodepenGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CodepenGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark)
    return __AllIcons!!
  }
