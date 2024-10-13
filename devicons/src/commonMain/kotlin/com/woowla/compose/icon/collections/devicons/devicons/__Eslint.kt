package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.eslint.Line
import com.woowla.compose.icon.collections.devicons.devicons.eslint.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.eslint.Original
import com.woowla.compose.icon.collections.devicons.devicons.eslint.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.eslint.Plain
import com.woowla.compose.icon.collections.devicons.devicons.eslint.PlainWordmark
import kotlin.collections.List as ____KtList

public object EslintGroup

public val Devicons.Eslint: EslintGroup
  get() = EslintGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val EslintGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
