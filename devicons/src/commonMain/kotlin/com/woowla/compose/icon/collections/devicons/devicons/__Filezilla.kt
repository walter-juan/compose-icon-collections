package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.filezilla.Line
import com.woowla.compose.icon.collections.devicons.devicons.filezilla.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.filezilla.Original
import com.woowla.compose.icon.collections.devicons.devicons.filezilla.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.filezilla.Plain
import com.woowla.compose.icon.collections.devicons.devicons.filezilla.PlainWordmark
import kotlin.collections.List as ____KtList

public object FilezillaGroup

public val Devicons.Filezilla: FilezillaGroup
  get() = FilezillaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FilezillaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
