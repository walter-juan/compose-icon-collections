package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.gatsby.Original
import com.woowla.compose.icon.collections.devicons.devicons.gatsby.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.gatsby.PlainWordmark
import kotlin.collections.List as ____KtList

public object GatsbyGroup

public val Devicons.Gatsby: GatsbyGroup
  get() = GatsbyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GatsbyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
