package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.devicon.Line
import com.woowla.compose.icon.collections.devicons.devicons.devicon.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.devicon.Original
import com.woowla.compose.icon.collections.devicons.devicons.devicon.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.devicon.Plain
import com.woowla.compose.icon.collections.devicons.devicons.devicon.PlainWordmark
import kotlin.collections.List as ____KtList

public object DeviconGroup

public val Devicons.Devicon: DeviconGroup
  get() = DeviconGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DeviconGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
