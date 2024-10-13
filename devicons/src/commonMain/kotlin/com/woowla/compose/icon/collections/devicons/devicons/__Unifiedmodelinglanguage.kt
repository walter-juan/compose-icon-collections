package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.unifiedmodelinglanguage.Original
import com.woowla.compose.icon.collections.devicons.devicons.unifiedmodelinglanguage.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.unifiedmodelinglanguage.Plain
import com.woowla.compose.icon.collections.devicons.devicons.unifiedmodelinglanguage.PlainWordmark
import kotlin.collections.List as ____KtList

public object UnifiedmodelinglanguageGroup

public val Devicons.Unifiedmodelinglanguage: UnifiedmodelinglanguageGroup
  get() = UnifiedmodelinglanguageGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val UnifiedmodelinglanguageGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
