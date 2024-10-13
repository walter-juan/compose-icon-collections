package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.nim.Line
import com.woowla.compose.icon.collections.devicons.devicons.nim.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nim.Original
import com.woowla.compose.icon.collections.devicons.devicons.nim.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nim.Plain
import com.woowla.compose.icon.collections.devicons.devicons.nim.PlainWordmark
import kotlin.collections.List as ____KtList

public object NimGroup

public val Devicons.Nim: NimGroup
  get() = NimGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NimGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
