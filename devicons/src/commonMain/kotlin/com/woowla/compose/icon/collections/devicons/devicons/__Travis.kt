package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.travis.Line
import com.woowla.compose.icon.collections.devicons.devicons.travis.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.travis.Original
import com.woowla.compose.icon.collections.devicons.devicons.travis.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.travis.Plain
import com.woowla.compose.icon.collections.devicons.devicons.travis.PlainWordmark
import kotlin.collections.List as ____KtList

public object TravisGroup

public val Devicons.Travis: TravisGroup
  get() = TravisGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TravisGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
