package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.antdesign.Original
import com.woowla.compose.icon.collections.devicons.devicons.antdesign.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.antdesign.Plain
import com.woowla.compose.icon.collections.devicons.devicons.antdesign.PlainWordmark
import kotlin.collections.List as ____KtList

public object AntdesignGroup

public val Devicons.Antdesign: AntdesignGroup
  get() = AntdesignGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AntdesignGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
