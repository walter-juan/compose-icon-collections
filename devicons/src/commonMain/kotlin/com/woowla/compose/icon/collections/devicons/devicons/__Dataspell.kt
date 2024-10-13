package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.dataspell.Original
import com.woowla.compose.icon.collections.devicons.devicons.dataspell.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.dataspell.Plain
import com.woowla.compose.icon.collections.devicons.devicons.dataspell.PlainWordmark
import kotlin.collections.List as ____KtList

public object DataspellGroup

public val Devicons.Dataspell: DataspellGroup
  get() = DataspellGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DataspellGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
