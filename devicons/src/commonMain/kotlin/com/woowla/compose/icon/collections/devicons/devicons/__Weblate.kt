package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.weblate.Original
import com.woowla.compose.icon.collections.devicons.devicons.weblate.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.weblate.Plain
import com.woowla.compose.icon.collections.devicons.devicons.weblate.PlainWordmark
import kotlin.collections.List as ____KtList

public object WeblateGroup

public val Devicons.Weblate: WeblateGroup
  get() = WeblateGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val WeblateGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
