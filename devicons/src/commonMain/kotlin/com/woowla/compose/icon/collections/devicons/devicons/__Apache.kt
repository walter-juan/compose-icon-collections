package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.apache.Line
import com.woowla.compose.icon.collections.devicons.devicons.apache.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.apache.Original
import com.woowla.compose.icon.collections.devicons.devicons.apache.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.apache.Plain
import com.woowla.compose.icon.collections.devicons.devicons.apache.PlainWordmark
import kotlin.collections.List as ____KtList

public object ApacheGroup

public val Devicons.Apache: ApacheGroup
  get() = ApacheGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ApacheGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
