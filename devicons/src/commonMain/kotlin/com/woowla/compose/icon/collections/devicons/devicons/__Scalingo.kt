package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.scalingo.Line
import com.woowla.compose.icon.collections.devicons.devicons.scalingo.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.scalingo.Original
import com.woowla.compose.icon.collections.devicons.devicons.scalingo.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.scalingo.Plain
import com.woowla.compose.icon.collections.devicons.devicons.scalingo.PlainWordmark
import kotlin.collections.List as ____KtList

public object ScalingoGroup

public val Devicons.Scalingo: ScalingoGroup
  get() = ScalingoGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ScalingoGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
